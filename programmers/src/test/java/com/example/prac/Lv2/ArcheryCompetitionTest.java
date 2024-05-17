package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ArcheryCompetitionTest {
    @Test
    public void testSolution() {
        ArcheryCompetition competition = new ArcheryCompetition();

        // Test Case 1
        int n1 = 5;
        int[] info1 = { 2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 };
        int[] expected1 = { 0, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(expected1, competition.solution(n1, info1));

        // Test Case 2
        int n2 = 1;
        int[] info2 = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] expected2 = { -1 };
        assertArrayEquals(expected2, competition.solution(n2, info2));

        // Test Case 3
        int n3 = 9;
        int[] info3 = { 0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1 };
        int[] expected3 = { 1, 1, 2, 0, 1, 2, 2, 0, 0, 0, 0 };
        assertArrayEquals(expected3, competition.solution(n3, info3));

        // Test Case 4
        int n4 = 10;
        int[] info4 = { 0, 0, 0, 0, 0, 0, 0, 0, 3, 4, 3 };
        int[] expected4 = { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 2 };
        assertArrayEquals(expected4, competition.solution(n4, info4));
    }
}
