package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ThanosTest {
    @Test
    public void testSolution() {
        Thanos thanos = new Thanos();

        String input1 = "10100101";
        String expectedOutput1 = "0011";
        assertEquals(expectedOutput1, thanos.removeHalf(input1));

        String input2 = "0011";
        String expectedOutput2 = "01";
        assertEquals(expectedOutput2, thanos.removeHalf(input2));
    }
}
