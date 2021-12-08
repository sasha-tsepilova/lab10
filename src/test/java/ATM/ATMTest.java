package ATM;

import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    ByteArrayOutputStream stream = new ByteArrayOutputStream();
    ATM atm ;
    @BeforeEach
    void setUp() {
        atm = new ATM();
        System.setOut(new PrintStream(stream));
    }

    @SneakyThrows
    @Test
    void process() {
        atm.process(120);
        assertTrue(stream.toString().contains("Took 6 20-bills."));
        atm.process(15);
        assertTrue(stream.toString().contains("Took 1 10-bills."));
        assertTrue(stream.toString().contains("Took 1 5-bills."));

    }
}