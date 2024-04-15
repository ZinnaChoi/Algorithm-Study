package com.example.baekjoon.gold;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OneTwoThreePlusFourTest {

    @Test
    public void testSolution() {
        OneTwoThreePlusFour solver = new OneTwoThreePlusFour();

        assertEquals(4, solver.cntWays(4));
        assertEquals(8, solver.cntWays(7));
        assertEquals(14, solver.cntWays(10));
    }

}
