package labInterface;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {
    private static PrintStream consoleOutput;
    private static ByteArrayOutputStream message;
    private Plane plane = new Plane(4, "Boing 747");

    @BeforeAll
    static void setUp() throws Exception {
        consoleOutput = System.out;
        message = new ByteArrayOutputStream();
        PrintStream newOutput = new PrintStream(message);
        System.setOut(newOutput);
    }

    @AfterAll
    static void afterAll() throws Exception {
        System.setOut(consoleOutput);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        String expected = "Boing 747 with 4 engines";
        String actual = plane.toString();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void launch() {
        plane.launch();

        String expected = "Rolling until take-off" + System.lineSeparator();
        String actual = message.toString();
        assertEquals(expected, actual);

        message.reset();
    }

    @org.junit.jupiter.api.Test
    void land() {
        plane.land();

        String expected = "Rolling to a stop" + System.lineSeparator();
        String actual = message.toString();
        assertEquals(expected, actual);

        message.reset();
    }
}