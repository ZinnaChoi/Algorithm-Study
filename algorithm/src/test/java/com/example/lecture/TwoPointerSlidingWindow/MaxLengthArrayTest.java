package com.example.lecture.TwoPointerSlidingWindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxLengthArrayTest {
    @Test
    public void testSolution() {
        MaxLengthArray maxLengthArray = new MaxLengthArray();

        // Test case 1
        int N1 = 20;
        int k1 = 2;
        int[] arr1 = { 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1 };
        assertEquals(13, maxLengthArray.mySolution(N1, k1, arr1));

        // Test case 1
        int N2 = 14;
        int k2 = 2;
        int[] arr2 = { 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 };
        assertEquals(8, maxLengthArray.mySolution(N2, k2, arr2));
    }
}
