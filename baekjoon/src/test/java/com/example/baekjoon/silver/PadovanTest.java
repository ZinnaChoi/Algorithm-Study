package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PadovanTest {

    @Test
    public void testSolution() {
        Padovan padovan = new Padovan();

        int T1 = 2;
        int[] inputs1 = { 6, 12 };
        int[] expectedOutputs1 = { 3, 16 };

        for (int i = 0; i < T1; i++) {
            assertEquals(expectedOutputs1[i], padovan.getNthNum(inputs1[i]));
        }

        int T2 = 3;
        int[] inputs2 = { 2, 4, 10 };
        int[] expectedOutputs2 = { 1, 2, 9 };

        for (int i = 0; i < T2; i++) {
            assertEquals(expectedOutputs2[i], padovan.getNthNum(inputs2[i]));
        }
    }
}
