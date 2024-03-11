package com.example.lecture.SortingAndSearching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DuplicationCheckTest {
    @Test
    public void testSolution() {
        DuplicationCheck dc = new DuplicationCheck();

        // Test Case 1
        int[] arr1 = { 20, 25, 52, 30, 39, 33, 43, 33 };
        int N1 = 8;
        char expected1 = 'D';
        char result1 = dc.mySolution(N1, arr1);
        assertEquals(expected1, result1);

        // Test Case 2
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int N2 = 8;
        char expected2 = 'U';
        char result2 = dc.mySolution(N2, arr2);
        assertEquals(expected2, result2);
    }
}
