package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TownNumberingTest {

    @Test
    public void testSolution() {
        TownNumbering T = new TownNumbering();
        int N = 7;
        int[][] map = {
                { 0, 1, 1, 0, 1, 0, 0 },
                { 0, 1, 1, 0, 1, 0, 1 },
                { 1, 1, 1, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 1, 1 },
                { 0, 1, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 1, 1, 0 },
                { 0, 1, 1, 1, 0, 0, 0 }
        };

        List<Integer> expected = List.of(3, 7, 8, 9);
        List<Integer> result = T.getTownInfo(N, map);

        assertEquals(expected, result);
    }

}
