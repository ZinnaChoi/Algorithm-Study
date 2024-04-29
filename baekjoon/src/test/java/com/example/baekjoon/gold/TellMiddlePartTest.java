package com.example.baekjoon.gold;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TellMiddlePartTest {

    @Test
    public void testSolution() {
        TellMiddlePart tellMiddlePart = new TellMiddlePart();

        int[] input = { 1, 5, 2, 10, -99, 7, 5 };
        String expectedOutput = "1\n1\n2\n2\n2\n2\n5\n";

        String actualOutput = tellMiddlePart.tellMiddle(input);

        assertEquals(expectedOutput, actualOutput);
    }
}
