package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SortCoordinateTest {

    @Test
    public void testSortedCoordinate() {
        SortCoordinate sorter = new SortCoordinate();

        int[][] input = { { 3, 4 }, { 1, 1 }, { 1, -1 }, { 2, 2 }, { 3, 3 } };
        int[][] expected = { { 1, -1 }, { 1, 1 }, { 2, 2 }, { 3, 3 }, { 3, 4 } };

        int[][] result = sorter.sortedCoordinate(input.length, input);

        assertTrue(Arrays.deepEquals(expected, result));
    }

}
