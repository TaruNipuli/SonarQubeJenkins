package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGetNumbersString() {
        int n = 3;
        String expected = "Hello and welcome!\n" +
                "i = 1\n" +
                "i = 2\n" +
                "i = 3\n";

        String actual = App.getNumbersString(n);

        assertEquals(expected, actual);
    }
}
