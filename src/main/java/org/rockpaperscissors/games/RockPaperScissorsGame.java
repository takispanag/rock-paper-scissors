package org.rockpaperscissors.games;

import lombok.Getter;
import org.rockpaperscissors.enums.Move;
import org.rockpaperscissors.enums.Outcome;
import org.rockpaperscissors.players.Player;

/**
 * Represents a Rock-Paper-Scissors game. Default number of rounds is set to 100.
 */
@Getter
public class RockPaperScissorsGame implements Game {
    private final Player playerA;
    private final Player playerB;
    private final int numOfRounds;
    private int playerAWins = 0;
    private int playerBWins = 0;
    private int ties = 0;

    /**
     * Constructs a Rock-Paper-Scissors game with the specified players and number of rounds.
     *
     * @param playerA     The Player A instance.
     * @param playerB     The Player B instance.
     * @param numOfRounds The number of rounds to be played in the game.
     */
    public RockPaperScissorsGame(Player playerA, Player playerB, int numOfRounds) {
        this.playerA = playerA;
        this.playerB = playerB;
        if (numOfRounds < 1) throw new IllegalArgumentException("Number of rounds cannot be lower than 1");
        this.numOfRounds = numOfRounds;
    }

    /**
     * Plays the Rock-Paper-Scissors game.
     * It runs the specified number of rounds during construction and updates the scores accordingly.
     */
    public void play() {
        for (int i = 0; i < numOfRounds; i++) {
            Outcome outcome = playRound();
            if (outcome == Outcome.PLAYER_A_WINS) {
                playerAWins++;
            } else if (outcome == Outcome.PLAYER_B_WINS) {
                playerBWins++;
            } else {
                ties++;
            }
        }
    }

    /**
     * Displays the final results of the Rock-Paper-Scissors game.
     * It shows the number of wins for Player A, Player B, and the number of ties.
     */
    public void displayResults() {
        System.out.println("\n=============FINAL SCORE==============");
        System.out.printf("\tPlayer A wins: %-2d of %-3d games%n", playerAWins, numOfRounds);
        System.out.printf("\tPlayer B wins: %-2d of %-3d games%n", playerBWins, numOfRounds);
        System.out.printf("\tTies:          %-2d of %-3d games%n", ties, numOfRounds);
        System.out.println("======================================");
    }

    /**
     * Plays a single round of the Rock-Paper-Scissors game.
     *
     * @return The {@link Outcome} of the round ({@link Outcome#PLAYER_A_WINS}, {@link Outcome#PLAYER_B_WINS}, or {@link Outcome#TIE}).
     */
    private Outcome playRound() {
        Move playerAMove = playerA.getMove();
        Move playerBMove = playerB.getMove();

        System.out.println("PlayerA move = " + playerAMove + ", PlayerB move = " + playerBMove);

        if (playerAMove == playerBMove) {
            System.out.println("Round is a tie");
            return Outcome.TIE;
        } else if (playerBMove == Move.ROCK) {
            System.out.println("Player A wins the round");
            return Outcome.PLAYER_A_WINS;
        } else {
            System.out.println("Player B wins the round");
            return Outcome.PLAYER_B_WINS;
        }
    }
}