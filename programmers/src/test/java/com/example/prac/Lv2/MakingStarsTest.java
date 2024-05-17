package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MakingStarsTest {

    @Test
    public void testSolution() {
        MakingStars makingStars = new MakingStars();

        // Test Case 1
        int[][] line1 = {
                { 2, -1, 4 },
                { -2, -1, 4 },
                { 0, -1, 1 },
                { 5, -8, -12 },
                { 5, 8, 12 }
        };
        String[] expected1 = {
                "....*....",
                ".........",
                ".........",
                "*.......*",
                ".........",
                ".........",
                ".........",
                ".........",
                "*.......*"
        };
        assertArrayEquals(expected1, makingStars.solution(line1));

        // Test Case 2
        int[][] line2 = {
                { 0, 1, -1 },
                { 1, 0, -1 },
                { 1, 0, 1 }
        };
        String[] expected2 = {
                "*.*"
        };
        assertArrayEquals(expected2, makingStars.solution(line2));

        // Test Case 3
        int[][] line3 = {
                { 1, -1, 0 },
                { 2, -1, 0 }
        };
        String[] expected3 = {
                "*"
        };
        assertArrayEquals(expected3, makingStars.solution(line3));

        // Test Case 4
        int[][] line4 = {
                { 1, -1, 0 },
                { 2, -1, 0 },
                { 4, -1, 0 }
        };
        String[] expected4 = {
                "*"
        };
        assertArrayEquals(expected4, makingStars.solution(line4));
    }
}
