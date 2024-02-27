package com.example.lecture.HashMap_TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KthLargestNumTest {
    @Test
    public void testSolution() {
        KthLargestNum kthLargestNum = new KthLargestNum();

        // Test case 1
        int N1 = 10, k1 = 3;
        int[] nums1 = { 13, 15, 34, 23, 45, 65, 33, 11, 26, 42 };
        int expected1 = 143;
        assertEquals(expected1, kthLargestNum.mySolution(N1, k1, nums1));

        // Test case 2
        int N2 = 10, k2 = 1200;
        int[] nums2 = { 23, 26, 50, 17, 34, 35, 50, 22, 53, 41 };
        int expected2 = -1;
        assertEquals(expected2, kthLargestNum.mySolution(N2, k2, nums2));
    }
}
