package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RotatingSushiTest {
    @Test
    public void testSolution() {
        RotatingSushi rotatingSushi = new RotatingSushi();

        // Test Case 1
        assertEquals(4, rotatingSushi.getMaxTypeCnt(
                8, 50, 4, 7,
                new int[] { 2, 7, 9, 25, 7, 9, 7, 30 }));

        // Test Case 2
        assertEquals(5, rotatingSushi.getMaxTypeCnt(
                8, 30, 4, 30,
                new int[] { 7, 9, 7, 30, 2, 7, 9, 25 }));
    }
}
