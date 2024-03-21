package com.example.lecture.DP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxPartialIncreaseSeqTest {

    @Test
    public void testSolution() {
        MaxPartialIncreaseSeq solution = new MaxPartialIncreaseSeq();

        // Test case 1
        int N = 8;
        MaxPartialIncreaseSeq.arr = new int[] { 5, 3, 7, 8, 6, 2, 9, 4 };
        assertEquals(4, solution.getMaxLength(N));

        // Test case 2
        N = 4;
        MaxPartialIncreaseSeq.arr = new int[] { 2, 1, 3, 4 };
        assertEquals(3, solution.getMaxLength(N));

        // Test case 3
        N = 70;
        MaxPartialIncreaseSeq.arr = new int[] { 39, 68, 2, 31, 3, 56, 25, 58, 57, 35, 63, 19, 69, 22, 54, 38, 41, 53, 6,
                32, 27, 34, 17, 61, 8, 36, 18, 55, 26, 66, 43, 24, 12, 50, 30, 59, 47, 46, 33, 70, 4, 21, 10, 44, 62,
                28, 65, 14, 37, 15, 45, 48, 7, 64, 1, 49, 51, 13, 23, 60, 20, 40, 11, 5, 67, 16, 9, 29, 52, 42 };
        assertEquals(15, solution.getMaxLength(N));
    }
}
