package ut;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.rockpaperscissors.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class MainTest {

    @Test
    public void testMain() {
        // Redirect System.out to capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(new String[]{});
        String consoleOutput = outputStream.toString().trim();

        assertTrue(consoleOutput.contains("Player A wins"));
        assertTrue(consoleOutput.contains("Player B wins"));
        assertTrue(consoleOutput.contains("Ties"));
    }
}
