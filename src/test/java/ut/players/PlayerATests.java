package ut.players;

import org.junit.jupiter.api.Test;
import org.rockpaperscissors.enums.Move;
import org.rockpaperscissors.players.Player;
import org.rockpaperscissors.players.PlayerA;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerATests {

    @Test
    public void testGetMove_ReturnsPaper() {
        Player player = new PlayerA();

        assertNotNull(player.getMove());
        assertEquals(Move.PAPER, player.getMove());
    }
}
