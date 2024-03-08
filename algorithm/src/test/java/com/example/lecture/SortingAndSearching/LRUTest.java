package com.example.lecture.SortingAndSearching;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class LRUTest {

    @Test
    public void testSolution() {
        LRU lru = new LRU();

        // Test Case 1
        int S1 = 5;
        int N1 = 9;
        int[] works1 = { 1, 2, 3, 2, 6, 2, 3, 5, 7 };
        int[] expected1 = { 7, 5, 3, 2, 6 };
        assertArrayEquals(expected1, lru.mySolution(S1, N1, works1));

        // Test Case 2
        int S2 = 5;
        int N2 = 20;
        int[] works2 = { 8, 5, 17, 8, 4, 9, 12, 4, 7, 19, 5, 19, 8, 15, 11, 12, 1, 4, 17, 18 };
        int[] expected2 = { 18, 17, 4, 1, 12 };
        assertArrayEquals(expected2, lru.mySolution(S2, N2, works2));
    }
}