package com.example.lecture.SortingAndSearching;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class BubbleSortingTest {
    @Test
    public void testSolution() {
        BubbleSorting sorter = new BubbleSorting();

        // Test case 1
        int[] input1 = { 3, 7, 1, 5, 4, 2, 9, 8, 6 };
        int[] expected1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertArrayEquals(expected1, sorter.mySolution(input1.length, input1));

        // Test case 2
        int[] input2 = { 56, 68, 62, 69, 64, 89, 56, 68, 93, 53 };
        int[] expected2 = { 53, 56, 56, 62, 64, 68, 68, 69, 89, 93 };
        assertArrayEquals(expected2, sorter.mySolution(input2.length, input2));

    }
}
