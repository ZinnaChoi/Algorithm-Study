package com.example.lecture.SortingAndSearching;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MischievousChildTest {
    @Test
    public void testSolution() {
        MischievousChild mc = new MischievousChild();

        // Test Case 1
        int[] heights1 = { 120, 125, 152, 130, 135, 135, 143, 127, 160 };
        int N1 = 9;
        int[] expected1 = { 3, 8 };
        int[] result1 = mc.mySolution(N1, heights1);
        assertArrayEquals(expected1, result1);

        // Test Case 2
        int[] heights2 = { 122, 123, 125, 125, 128, 130, 133, 137, 138, 138, 140, 141, 142, 143, 145, 147, 149, 149,
                154, 154, 155, 157, 161, 167, 167, 167, 161, 170, 173, 173 };
        int N2 = 30;
        int[] expected2 = { 24, 27 };
        int[] result2 = mc.mySolution(N2, heights2);
        assertArrayEquals(expected2, result2);
    }
}
