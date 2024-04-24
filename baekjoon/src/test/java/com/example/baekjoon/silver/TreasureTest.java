package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TreasureTest {

    @Test
    public void testGetMinS() {
        Treasure treasure = new Treasure();

        // Test Case 1
        int N1 = 5;
        int[] A1 = { 1, 1, 1, 6, 0 };
        int[] B1 = { 2, 8, 8, 3, 1 };
        int expected1 = 19;
        assertEquals(expected1, treasure.getMinS(N1, A1, B1));

        // Test Case 2
        int N2 = 9;
        int[] A2 = { 5, 15, 100, 31, 39, 0, 0, 3, 26 };
        int[] B2 = { 11, 12, 13, 2, 3, 4, 5, 9, 1 };
        int expected2 = 528;
        assertEquals(expected2, treasure.getMinS(N2, A2, B2));
    }
}
