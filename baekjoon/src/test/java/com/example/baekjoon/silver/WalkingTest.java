package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WalkingTest {

    @Test
    public void testSolution() {
        Walking walking = new Walking();

        assertEquals(20, walking.getMinTime(2, 0, 12, 10));
        assertEquals(240, walking.getMinTime(24, 16, 12, 10));
        assertEquals(41010000000L, walking.getMinTime(10000000, 50000000, 800, 901));
        assertEquals(3929, walking.getMinTime(135, 122, 43, 29));
    }
}
