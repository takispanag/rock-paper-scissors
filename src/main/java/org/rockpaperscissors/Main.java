package org.rockpaperscissors;

import org.rockpaperscissors.games.Game;
import org.rockpaperscissors.games.RockPaperScissorsGame;
import org.rockpaperscissors.players.PlayerA;
import org.rockpaperscissors.players.PlayerB;

/**
 * The main class that initializes and runs the Rock-Paper-Scissors game.
 */
public class Main {

    /**
     * Plays the Rock-Paper-Scissors game for 100 rounds and displays the results.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Game game = new RockPaperScissorsGame(new PlayerA(), new PlayerB(), 100);
        game.play();
        game.displayResults();
    }
}