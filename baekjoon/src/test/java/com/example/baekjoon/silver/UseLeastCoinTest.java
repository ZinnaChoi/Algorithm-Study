package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UseLeastCoinTest {

    @Test
    public void testSolution() {
        UseLeastCoin useLeastCoin = new UseLeastCoin();

        // Test case 1
        int[] coins1 = { 1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000 };
        int K1 = 4200;
        assertEquals(6, useLeastCoin.minCoinCnt(coins1, K1), "The output for K=4200 should be 6.");

        // Test case 2
        int[] coins2 = { 1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000 };
        int K2 = 4790;
        assertEquals(12, useLeastCoin.minCoinCnt(coins2, K2), "The output for K=4790 should be 12.");
    }
}
