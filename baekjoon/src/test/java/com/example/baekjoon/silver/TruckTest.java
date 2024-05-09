package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TruckTest {

    @Test
    public void testSolution() {

        Truck truck = new Truck();

        // Test Case 1
        int n1 = 4;
        int w1 = 2;
        int L1 = 10;
        int[] trucks1 = { 7, 4, 5, 6 };
        int expected1 = 8;
        assertEquals(expected1, truck.getMinTime(n1, w1, L1, trucks1));

        // Test Case 2
        int n2 = 10;
        int w2 = 100;
        int L2 = 100;
        int[] trucks2 = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        int expected2 = 110;
        assertEquals(expected2, truck.getMinTime(n2, w2, L2, trucks2));
    }
}
