package com.example.lecture.TwoPointerSlidingWindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumSalesTest {
    @Test
    public void testSolution() {
        MaximumSales ms = new MaximumSales();

        // Test case 1
        int N1 = 10;
        int K1 = 3;
        int[] hist1 = { 100, 15, 11, 20, 25, 10, 20, 19, 13, 15 };
        int expected1 = 126;
        assertEquals(expected1, ms.mySolution(N1, K1, hist1));

        // Test case 2
        int N2 = 20;
        int K2 = 3;
        int[] hist2 = { 365, 8, 50, 150, 60, 355, 154, 215, 150, 315, 293, 226, 408, 11, 344, 199, 313, 82, 394, 304 };
        int expected2 = 927;
        assertEquals(expected2, ms.mySolution(N2, K2, hist2));
    }
}
