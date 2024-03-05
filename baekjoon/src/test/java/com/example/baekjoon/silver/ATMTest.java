package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ATMTest {

    @Test
    public void testGetMinTime() {
        ATM atm = new ATM();

        // Test Case 1
        int[] case1 = { 3, 1, 4, 3, 2 };
        int expected1 = 32;
        int actual1 = atm.getMinTime(case1.length, case1);
        assertEquals(expected1, actual1, "The expected value should be " + expected1);
    }

}
