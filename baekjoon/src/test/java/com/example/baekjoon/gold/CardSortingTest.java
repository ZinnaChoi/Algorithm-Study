package com.example.baekjoon.gold;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CardSortingTest {

    @Test
    public void testSolution() {
        CardSorting sorter = new CardSorting();

        int N1 = 3;
        int[] nums1 = { 10, 20, 40 };
        int expected1 = 100;
        assertEquals(expected1, sorter.getMinCnt(N1, nums1));

        int N3 = 4;
        int[] nums3 = { 5, 15, 10, 20 };
        int expected3 = 95;
        assertEquals(expected3, sorter.getMinCnt(N3, nums3));
    }
}
