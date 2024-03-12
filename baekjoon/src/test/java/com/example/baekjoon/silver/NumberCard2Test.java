package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberCard2Test {
    @Test
    public void testSolution() {
        NumberCard2 numberCard2 = new NumberCard2();

        // Test Case 1
        int[] cards1 = { 6, 3, 2, 10, 10, 10, -10, -10, 7, 3 };
        int[] nums1 = { 10, 9, -5, 2, 3, 4, 5, -10 };
        String expected1 = "3 0 0 1 2 0 0 2 ";
        assertEquals(expected1, numberCard2.mySolution(cards1, nums1));
    }
}
