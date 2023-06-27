package ut.games;

import org.junit.jupiter.api.Test;
import org.rockpaperscissors.games.RockPaperScissorsGame;
import org.rockpaperscissors.players.PlayerA;
import org.rockpaperscissors.players.PlayerB;


import static org.junit.jupiter.api.Assertions.*;

public class RockPaperScissorsGameTests {

    @Test
    public void testRockPaperScissorsGameConstruction_WithRoundsMoreThanOne() {
        assertDoesNotThrow(() -> new RockPaperScissorsGame(new PlayerA(), new PlayerB(), 1));
        assertDoesNotThrow(() -> new RockPaperScissorsGame(new PlayerA(), new PlayerB(), 10));
        assertDoesNotThrow(() -> new RockPaperScissorsGame(new PlayerA(), new PlayerB(), 1000));
    }

    @Test
    public void testRockPaperScissorsGameConstruction_WithRoundsLessThanOne() {
        assertThrows(IllegalArgumentException.class, () -> new RockPaperScissorsGame(new PlayerA(), new PlayerB(), 0));
        assertThrows(IllegalArgumentException.class, () -> new RockPaperScissorsGame(new PlayerA(), new PlayerB(), -1));
        assertThrows(IllegalArgumentException.class, () -> new RockPaperScissorsGame(new PlayerA(), new PlayerB(), -1000));
    }

    @Test
    public void testPlay_With100Rounds() {
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame(new PlayerA(), new PlayerB(), 100);
        rockPaperScissorsGame.play();

        assertTrue(rockPaperScissorsGame.getPlayerAWins() > 0);
        assertTrue(rockPaperScissorsGame.getPlayerBWins() > 0);
        assertTrue(rockPaperScissorsGame.getTies() > 0);
        assertEquals(100, rockPaperScissorsGame.getNumOfRounds());
        assertEquals(100, rockPaperScissorsGame.getPlayerAWins() + rockPaperScissorsGame.getPlayerBWins() + rockPaperScissorsGame.getTies());
    }

    @Test
    public void testPlay_With200Rounds() {
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame(new PlayerA(), new PlayerB(), 200);
        rockPaperScissorsGame.play();

        assertTrue(rockPaperScissorsGame.getPlayerAWins() > 0);
        assertTrue(rockPaperScissorsGame.getPlayerBWins() > 0);
        assertTrue(rockPaperScissorsGame.getTies() > 0);
        assertEquals(200, rockPaperScissorsGame.getNumOfRounds());
        assertEquals(200, rockPaperScissorsGame.getPlayerAWins() + rockPaperScissorsGame.getPlayerBWins() + rockPaperScissorsGame.getTies());
    }
}
