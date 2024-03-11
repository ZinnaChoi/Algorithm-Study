package com.example.lecture.SortingAndSearching;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SortCoordinateTest {

    @Test
    public void testSolution() {
        SortCoordinate sc = new SortCoordinate();

        // Test Case
        int[][] arr1 = { { 2, 7 }, { 1, 3 }, { 1, 2 }, { 2, 5 }, { 3, 6 } };
        int N1 = 5;
        int[][] expected1 = { { 1, 2 }, { 1, 3 }, { 2, 5 }, { 2, 7 }, { 3, 6 } };
        int[][] result1 = sc.mySolution(N1, arr1);
        assertArrayEquals(expected1, result1);
    }

}
