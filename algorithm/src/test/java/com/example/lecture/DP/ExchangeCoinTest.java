package com.example.lecture.DP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExchangeCoinTest {

    @Test
    public void testSolution() {

        // Test Case 1
        ExchangeCoin exchangeCoin1 = new ExchangeCoin();
        ExchangeCoin.N = 5;
        ExchangeCoin.coin = new int[] { 1, 5, 7, 11, 15 };
        ExchangeCoin.d = new int[40];
        int result1 = exchangeCoin1.dp(39);
        assertEquals(5, result1);

        // Test Case 2
        ExchangeCoin exchangeCoin2 = new ExchangeCoin();
        ExchangeCoin.N = 5;
        ExchangeCoin.coin = new int[] { 1, 8, 20, 25, 50 };
        ExchangeCoin.d = new int[130];
        int result2 = exchangeCoin2.dp(129);
        assertEquals(5, result2);
    }

}
