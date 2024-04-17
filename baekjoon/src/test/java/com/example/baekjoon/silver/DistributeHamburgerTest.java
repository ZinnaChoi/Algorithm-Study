package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DistributeHamburgerTest {

    @Test
    public void testSolution() {
        DistributeHamburger distributor = new DistributeHamburger();

        // Test Case 1
        int N1 = 20;
        int K1 = 1;
        char[] loc1 = "HHPHPPHHPPHPPPHPHPHP".toCharArray();
        int expected1 = 8;
        int actual1 = distributor.getMaxPeopleCnt(N1, K1, loc1);
        assertEquals(expected1, actual1);

        // Test Case 2
        int N2 = 20;
        int K2 = 2;
        char[] loc2 = "HHHHHPPPPPHPHPHPHHHP".toCharArray();
        int expected2 = 7;
        int actual2 = distributor.getMaxPeopleCnt(N2, K2, loc2);
        assertEquals(expected2, actual2);
    }
}
