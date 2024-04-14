package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CntZeroOneInFiboTest {

    @Test
    public void testSolution() {

        CntZeroOneInFibo cntZeroOneInFibo = new CntZeroOneInFibo();
        int[] inputs = { 0, 1, 3, 6, 22 };
        int[][] expectedOutputs = {
                { 1, 0 },
                { 0, 1 },
                { 1, 2 },
                { 5, 8 },
                { 10946, 17711 }
        };

        for (int i = 0; i < inputs.length; i++) {
            int num = inputs[i];
            CntZeroOneInFibo.zeroCnt = new int[num + 1];
            CntZeroOneInFibo.oneCnt = new int[num + 1];
            int actualZeroCount = cntZeroOneInFibo.cntZero(num);
            int actualOneCount = cntZeroOneInFibo.cntOne(num);
            assertEquals(expectedOutputs[i][0], actualZeroCount);
            assertEquals(expectedOutputs[i][1], actualOneCount);
        }
    }
}
