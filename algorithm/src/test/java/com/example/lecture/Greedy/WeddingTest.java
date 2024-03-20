package com.example.lecture.Greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WeddingTest {

    @Test
    public void testSolution() {
        Wedding wedding = new Wedding();

        // Test Case 1
        int[][] visitors1 = { { 14, 18 }, { 12, 15 }, { 15, 20 }, { 20, 30 }, { 5, 14 } };
        int expected1 = 2;
        assertEquals(expected1, wedding.mySolution(5, visitors1));

        // Test Case 2
        int[][] visitors2 = {
                { 17, 28 }, { 6, 30 }, { 1, 27 }, { 19, 38 }, { 4, 46 }, { 23, 30 },
                { 35, 43 }, { 26, 45 }, { 21, 31 }, { 11, 44 }
        };
        int expected2 = 9;
        assertEquals(expected2, wedding.mySolution(10, visitors2));
    }
}
