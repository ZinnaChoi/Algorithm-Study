package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MaxHeapTest {

    @Test
    public void testSolution() {
        MaxHeap maxHeap = new MaxHeap();

        int[] input = { 0, 1, 2, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0 };
        List<Integer> expectedOutput = List.of(0, 2, 1, 3, 2, 1, 0, 0);

        List<Integer> result = maxHeap.printMax(input);

        assertEquals(expectedOutput, result);
    }
}
