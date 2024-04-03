package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MakeOneTest {

    @Test
    void testSolution() {
        MakeOne makeOne = new MakeOne();
        MakeOne.N = 10;
        MakeOne.dp = new int[MakeOne.N + 1];

        assertEquals(3, makeOne.getMinOperationCnt(10));
        MakeOne.N = 26;
        MakeOne.dp = new int[MakeOne.N + 1];
        assertEquals(5, makeOne.getMinOperationCnt(26));
    }

}
