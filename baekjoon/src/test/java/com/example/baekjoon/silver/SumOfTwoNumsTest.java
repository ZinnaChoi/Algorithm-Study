package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfTwoNumsTest {

    @Test
    public void testSolution() {
        SumOfTwoNums sumOfTwoNums = new SumOfTwoNums();

        // Test Case 1
        int n1 = 9;
        int[] arr1 = { 5, 12, 7, 10, 9, 1, 2, 3, 11 };
        int x1 = 13;
        int expected1 = 3;
        assertEquals(expected1, sumOfTwoNums.getPairCnt(n1, x1, arr1));

    }

}
