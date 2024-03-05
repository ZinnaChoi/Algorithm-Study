package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NewRecruitTest {
    @Test
    public void testGetMaxRecruit() {
        NewRecruit newRecruit = new NewRecruit();

        // Test Case 1
        int[][] arr1 = {
                { 3, 2 },
                { 1, 4 },
                { 4, 1 },
                { 2, 3 },
                { 5, 5 }
        };
        int expected1 = 4;
        int actual1 = newRecruit.getMaxRecruit(arr1.length, arr1);
        assertEquals(expected1, actual1);

        // Test Case 2
        int[][] arr2 = {
                { 3, 6 },
                { 7, 3 },
                { 4, 2 },
                { 1, 4 },
                { 5, 7 },
                { 2, 5 },
                { 6, 1 }
        };
        int expected2 = 3;
        int actual2 = newRecruit.getMaxRecruit(arr2.length, arr2);
        assertEquals(expected2, actual2);
    }
}
