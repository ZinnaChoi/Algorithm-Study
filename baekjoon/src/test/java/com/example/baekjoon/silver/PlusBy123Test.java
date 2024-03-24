package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PlusBy123Test {
    @Test
    public void testSolution() {
        PlusBy123 plusBy123 = new PlusBy123();

        assertEquals(7, plusBy123.D(4));
        assertEquals(44, plusBy123.D(7));
        assertEquals(274, plusBy123.D(10));
    }

}
