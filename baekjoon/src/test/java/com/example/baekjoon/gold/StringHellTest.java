package com.example.baekjoon.gold;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class StringHellTest {

    @Test
    public void testSolution() throws IOException {

        String input = "3 3 2\naaa\naba\naaa\naa\nbb\n";
        InputStream stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            PrintStream old = System.out;
            System.setOut(ps);

            StringHell.main(new String[0]);

            System.out.flush();
            System.setOut(old);
            String output = baos.toString().trim();

            assertTrue(output.contains("56"));
            assertTrue(output.contains("0"));

        } finally {
            System.setIn(stdin);
        }
    }
}
