package com.example.lecture.SortingAndSearching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    public void testSolution() {

        BinarySearch binarySearch = new BinarySearch();

        // Test case 1
        int N1 = 15;
        int M1 = 99;
        int[] arr1 = { 73, 32, 31, 49, 94, 37, 40, 62, 78, 66, 27, 100, 99, 29, 9 };
        assertEquals(14, binarySearch.mySolution(N1, M1, arr1));

        // Test case 2
        int N2 = 30;
        int M2 = 57;
        int[] arr2 = { 6, 32, 38, 1, 28, 76, 51, 8, 98, 88, 74, 60, 65, 57, 97, 63, 56, 99, 85, 5, 13, 100, 61, 36, 44,
                50, 62, 41, 91, 9 };
        assertEquals(16, binarySearch.mySolution(N2, M2, arr2));

    }
}
