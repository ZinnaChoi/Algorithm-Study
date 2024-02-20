package com.example.lecture.TwoPointerSlidingWindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContinuousPartialSequenceTest {
    @Test
    public void testSolution() {
        ContinuousPartialSequence continuousPartialSequence = new ContinuousPartialSequence();

        // Test case 1
        int N1 = 8;
        int M1 = 6;
        int[] arr1 = { 1, 2, 1, 3, 1, 1, 1, 2 };
        int expected1 = 3;
        int result1 = continuousPartialSequence.mySolution(N1, M1, arr1);
        assertEquals(expected1, result1);

        // Test case 2
        int N2 = 100;
        int M2 = 100;
        int[] arr2 = { 3, 3, 1, 4, 5, 2, 2, 5, 2, 1, 2, 2, 1, 1, 4, 1, 4, 3, 3, 5, 1, 5, 1, 3, 4, 5, 4, 5, 2, 4, 2, 1,
                1, 4, 2, 1, 5, 3, 1, 3, 1, 1, 1, 2, 4, 4, 5, 5, 5, 5, 3, 2, 5, 5, 3, 2, 3, 4, 1, 3, 3, 4, 5, 1, 3, 1, 3,
                2, 3, 1, 2, 3, 2, 5, 5, 4, 2, 3, 1, 2, 3, 2, 4, 5, 2, 4, 4, 4, 4, 3, 1, 5, 2, 2, 1, 3, 2, 5, 4, 1 };
        int expected2 = 23;
        int result2 = continuousPartialSequence.mySolution(N2, M2, arr2);
        assertEquals(expected2, result2);
    }
}
