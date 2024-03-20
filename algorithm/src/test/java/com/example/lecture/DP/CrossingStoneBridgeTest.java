package com.example.lecture.DP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CrossingStoneBridgeTest {

    @Test
    public void testSolution() {
        CrossingStoneBridge bridge = new CrossingStoneBridge();

        // Test Case 1
        int N1 = 7;
        int expected1 = 34;
        assertEquals(expected1, bridge.cntWay(N1 + 2));

        // Test Case 2
        int N2 = 12;
        int expected2 = 377;
        assertEquals(expected2, bridge.cntWay(N2 + 2));
    }
}
