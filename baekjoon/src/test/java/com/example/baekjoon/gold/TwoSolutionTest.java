package com.example.baekjoon.gold;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSolutionTest {

    @Test
    public void testSolution() {
        TwoSolution twoSolution = new TwoSolution();

        int[] testInput = { -2, 4, -99, -1, 98 };
        int[] expectedOutput = { -99, 98 };

        int[] actualOutput = twoSolution.getBestSolutions(testInput);

        assertArrayEquals(expectedOutput, actualOutput);
    }

}
