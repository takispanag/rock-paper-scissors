package org.rockpaperscissors.players;

import org.rockpaperscissors.enums.Move;

/**
 * Represents a player in the Rock-Paper-Scissors game.
 */
public interface Player {

    /**
     * Gets the {@link Move} chosen by the player.
     *
     * @return The {@link Move} chosen by the player.
     */
    Move getMove();
}