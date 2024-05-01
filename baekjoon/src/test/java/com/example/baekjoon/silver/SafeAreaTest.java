package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class SafeAreaTest {

    @Test
    public void testSolution() throws IOException {
        String data = "5\n6 8 2 6 2\n3 2 3 4 6\n6 7 3 3 2\n7 2 5 3 6\n8 9 5 2 7\n";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            PrintStream old = System.out;
            System.setOut(ps);

            SafeArea.main(new String[0]);

            System.out.flush();
            System.setOut(old);
            String output = baos.toString().trim();
            assertEquals("5", output);
        } finally {
            System.setIn(stdin);
        }
    }
}
