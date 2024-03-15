package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProvideSnackTest {

    @Test
    public void testSolution() {
        ProvideSnack provideSnack = new ProvideSnack();
        int N = 5;
        int[] order = { 5, 4, 1, 3, 2 };

        String expected = "Nice";
        String actual = provideSnack.mySolution(N, order);

        assertEquals(expected, actual);
    }
}
