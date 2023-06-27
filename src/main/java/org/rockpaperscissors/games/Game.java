package org.rockpaperscissors.games;

/**
 * Represents a game.
 */
public interface Game {

    /**
     * Plays the game.
     * The specific gameplay logic is defined by the implementing class.
     */
    void play();

    /**
     * Displays the results of the game.
     * The specific format and information displayed are defined by the implementing class.
     */
    void displayResults();
}