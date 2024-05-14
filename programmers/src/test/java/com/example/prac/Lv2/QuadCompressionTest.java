package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class QuadCompressionTest {

    @Test
    public void testSolution() {
        QuadCompression qc = new QuadCompression();

        int[][] arr1 = {
                { 1, 1, 0, 0 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 1 },
                { 1, 1, 1, 1 }
        };
        int[] expected1 = { 4, 9 };
        assertArrayEquals(expected1, qc.solution(arr1));

        int[][] arr2 = {
                { 1, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 1, 1, 1, 1 },
                { 0, 1, 0, 0, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 0, 1 },
                { 0, 0, 0, 0, 1, 1, 1, 1 }
        };
        int[] expected2 = { 10, 15 };
        assertArrayEquals(expected2, qc.solution(arr2));
    }
}
