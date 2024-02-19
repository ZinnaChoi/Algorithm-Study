package com.example.lecture.TwoPointerSlidingWindow;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class AggregateTwoArraysTest {

    @Test
    public void testSolution() {

        AggregateTwoArrays aggregateTwoArrays = new AggregateTwoArrays();

        // Test case 1
        int[] arr1Test1 = { 1, 10, 27, 39, 50, 61, 65, 70, 93, 93 };
        int[] arr2Test1 = { 7, 51, 65, 66, 70, 82, 93 };
        int[] expected1 = { 1, 7, 10, 27, 39, 50, 51, 61, 65, 65, 66, 70, 70, 82, 93, 93, 93 };
        assertArrayEquals(expected1,
                aggregateTwoArrays.mySolution(arr1Test1.length, arr2Test1.length, arr1Test1, arr2Test1));

        // Test case 2
        int[] arr1Test2 = { 14, 24, 35, 38, 45, 69, 78, 96, 97 };
        int[] arr2Test2 = { 1, 15, 27, 29, 40, 50, 58, 63, 70, 74, 75, 82, 99 };
        int[] expected2 = { 1, 14, 15, 24, 27, 29, 35, 38, 40, 45, 50, 58, 63, 69, 70, 74, 75, 78, 82, 96, 97, 99 };
        assertArrayEquals(expected2,
                aggregateTwoArrays.mySolution(arr1Test2.length, arr2Test2.length, arr1Test2, arr2Test2));
    }

}
