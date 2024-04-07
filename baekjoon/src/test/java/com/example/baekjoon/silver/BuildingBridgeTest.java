package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BuildingBridgeTest {

    @Test
    public void testSolution() {
        BuildingBridge buildingBridge = new BuildingBridge();

        int[][] comb1 = new int[3][3];
        int[][] comb2 = new int[6][2];
        int[][] comb3 = new int[30][14];

        int expected1 = 1;
        int expected2 = 5;
        int expected3 = 67863915;

        assertEquals(expected1, buildingBridge.cntBridge(2, 2, comb1));
        assertEquals(expected2, buildingBridge.cntBridge(5, 1, comb2));
        assertEquals(expected3, buildingBridge.cntBridge(29, 13, comb3));
    }
}
