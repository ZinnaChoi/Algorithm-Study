package com.example.lecture.SortingAndSearching;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class InsertSortingTest {

    @Test
    public void testSolution() {
        InsertSorting sorter = new InsertSorting();

        // Test Case 1
        int[] input1 = { 11, 7, 5, 6, 10, 9 };
        int[] expected1 = { 5, 6, 7, 9, 10, 11 };
        assertArrayEquals(expected1, sorter.mySolution(input1.length, input1));

        // Test Case 2
        int[] input2 = { 56, 68, 62, 69, 64, 89, 56, 68, 93, 53 };
        int[] expected2 = { 53, 56, 56, 62, 64, 68, 68, 69, 89, 93 };
        assertArrayEquals(expected2, sorter.mySolution(input2.length, input2));
    }

}
