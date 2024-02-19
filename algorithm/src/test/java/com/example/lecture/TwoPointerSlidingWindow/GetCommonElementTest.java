package com.example.lecture.TwoPointerSlidingWindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class GetCommonElementTest {
    @Test
    public void testSolution() {
        GetCommonElement getCommonElement = new GetCommonElement();

        // Test case 1
        int[] arr1Test1 = { 1, 3, 9, 5, 2 };
        int[] arr2Test1 = { 3, 2, 5, 7, 8 };
        ArrayList<Integer> expected1 = new ArrayList<>(Arrays.asList(2, 3, 5));
        ArrayList<Integer> result1 = getCommonElement.mySolution(arr1Test1.length, arr2Test1.length, arr1Test1,
                arr2Test1);
        assertEquals(expected1, result1);

        // Test case 1
        int[] arr1Test2 = { 999999999, 1000000000, 5 };
        int[] arr2Test2 = { 999999999, 1000000000, 5, 6, 7 };
        ArrayList<Integer> expected2 = new ArrayList<>(Arrays.asList(5, 999999999, 1000000000));
        ArrayList<Integer> result2 = getCommonElement.mySolution(arr1Test2.length, arr2Test2.length, arr1Test2,
                arr2Test2);
        assertEquals(expected2, result2);
    }
}
