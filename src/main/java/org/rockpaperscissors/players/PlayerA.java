package org.rockpaperscissors.players;

import org.rockpaperscissors.enums.Move;

/**
 * Represents Player A in the Rock-Paper-Scissors game.
 */
public class PlayerA implements Player {

    /**
     * Constructs a new instance of PlayerA.
     */
    public PlayerA() { }

    /**
     * Gets the {@link Move} chosen by Player A.
     *
     * @return Always the {@link Move#PAPER}.
     */
    @Override
    public Move getMove() {
        return Move.PAPER;
    }
}
