package com.example.lecture.DP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

    @Test
    public void testSolution() {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        assertEquals(233, climbingStairs.dp(12));
        assertEquals(5702887, climbingStairs.dp(33));
    }
}
