package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PoppingBalloonTest {
    @Test
    public void testSolution() {
        PoppingBalloon poppingBalloon = new PoppingBalloon();
        int N = 5;
        int[] papers = { 3, 2, 1, -3, -1 };
        String expected = "1 4 5 3 2";
        assertEquals(expected, poppingBalloon.popingOrder(N, papers));
    }
}
