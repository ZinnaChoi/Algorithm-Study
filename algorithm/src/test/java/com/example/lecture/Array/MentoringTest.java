package com.example.lecture.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MentoringTest {
    @Test
    public void testSolution() {
        Mentoring solution = new Mentoring();

        // Test case 1
        int N1 = 20, M1 = 2;
        int[][] rankArr1 = {
                { 19, 15, 4, 17, 12, 18, 6, 3, 11, 14, 1, 8, 13, 9, 2, 20, 5, 16, 10, 7 },
                { 5, 20, 18, 17, 14, 11, 19, 3, 10, 16, 6, 8, 13, 9, 2, 12, 4, 7, 1, 15 }
        };
        assertEquals(90, solution.mySolution(N1, M1, rankArr1));

        // Test case 2
        int N2 = 4, M2 = 3;
        int[][] rankArr2 = {
                { 3, 4, 1, 2 },
                { 4, 3, 2, 1 },
                { 3, 1, 4, 2 }
        };
        assertEquals(3, solution.mySolution(N2, M2, rankArr2));
    }
}
