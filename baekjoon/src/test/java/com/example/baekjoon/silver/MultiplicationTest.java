package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    public void testSolution() {
        Multiplication multiplication = new Multiplication();
        assertEquals(4, multiplication.getRemain(10, 11, 12));
    }
}
