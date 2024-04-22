package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

    @Test
    public void testSolution() {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        int N = 6;
        int[] stairs = { 0, 10, 20, 15, 25, 10, 20 };

        int expectedScore = 75;
        int calculatedScore = climbingStairs.getMaxScore(N, stairs);

        assertEquals(expectedScore, calculatedScore);
    }
}
