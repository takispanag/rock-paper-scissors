package org.rockpaperscissors.players;

import org.rockpaperscissors.enums.Move;

import java.util.Random;

/**
 * Represents Player B in the Rock-Paper-Scissors game.
 */
public class PlayerB implements Player {

    /**
     * Constructs a new instance of PlayerB.
     */
    public PlayerB() { }

    /**
     * Gets the {@link Move} that is randomly generated for Player B.
     *
     * @return A randomly generated {@link Move}.
     */
    @Override
    public Move getMove() {
        return getRandomMove();
    }

    /**
     * Generates a random {@link Move} for Player B.
     *
     * @return A randomly generated {@link Move} ({@link Move#ROCK}, {@link Move#PAPER}, or {@link Move#SCISSORS}).
     */
    private Move getRandomMove() {
        Random random = new Random();
        int choice = random.nextInt(3);

        return switch (choice) {
            case 0 -> Move.ROCK;
            case 1 -> Move.PAPER;
            default -> Move.SCISSORS;
        };
    }
}
