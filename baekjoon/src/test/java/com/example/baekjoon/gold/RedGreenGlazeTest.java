package com.example.baekjoon.gold;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RedGreenGlazeTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testSolution() throws Exception {
        String input = "5\n" +
                "RRRBB\n" +
                "GGBBB\n" +
                "BBBRR\n" +
                "BBRRR\n" +
                "RRRRR\n";
        ByteArrayInputStream br = new ByteArrayInputStream(input.getBytes());
        System.setIn(br);

        RedGreenGlaze.main(new String[] {});
        String output = outputStream.toString().trim();
        assertEquals("4 3", output);
    }
}
