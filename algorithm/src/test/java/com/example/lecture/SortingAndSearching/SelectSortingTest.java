package com.example.lecture.SortingAndSearching;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SelectSortingTest {

    @Test
    public void testSolution() {
        SelectSorting selectSorting = new SelectSorting();
        int[] input1 = { 3, 7, 1, 5, 4, 2, 9, 8, 6 };
        int[] expected1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertArrayEquals(expected1, selectSorting.mySolution(input1.length, input1));

        int[] input2 = { 56, 68, 62, 69, 64, 89, 56, 68, 93, 53 };
        int[] expected2 = { 53, 56, 56, 62, 64, 68, 68, 69, 89, 93 };

        assertArrayEquals(expected2, selectSorting.mySolution(input2.length, input2));
    }

}
