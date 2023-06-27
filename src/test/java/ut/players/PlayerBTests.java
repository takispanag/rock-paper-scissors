package ut.players;

import org.junit.jupiter.api.Test;
import org.rockpaperscissors.enums.Move;
import org.rockpaperscissors.players.Player;
import org.rockpaperscissors.players.PlayerB;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerBTests {

    @Test
    public void testGetMove_ReturnsRandomMove() {
        // HashMap indicating the count of each move
        Map<Move, Integer> moveCount = new HashMap<>();
        List<Move> validMoves = new ArrayList<>(Arrays.asList(
                Move.ROCK,
                Move.PAPER,
                Move.SCISSORS
        ));
        Player player = new PlayerB();

        // Validate that generated move is one of the validMoves and also count each move
        for (int i = 0; i < 10; i++) {
            Move move = player.getMove();

            moveCount.put(move, moveCount.getOrDefault(move, 0) + 1);
            assertTrue(validMoves.contains(move));
        }

        // Ensure each move has at least one occurrence
        for (Move move : validMoves) {
            assertTrue(moveCount.containsKey(move));
            assertTrue(moveCount.get(move) >= 1);
        }
    }
}
