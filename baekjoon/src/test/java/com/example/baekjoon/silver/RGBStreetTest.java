package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RGBStreetTest {

    @Test
    public void testSolution() {
        RGBStreet rgbStreet = new RGBStreet();

        // Test case 1
        RGBStreet.N = 3;
        int[][] info1 = {
                { 26, 40, 83 },
                { 49, 60, 57 },
                { 13, 89, 99 }
        };
        assertEquals(96, rgbStreet.getMinCost(info1));

        // Test case 2
        RGBStreet.N = 6;
        int[][] info2 = {
                { 30, 19, 5 },
                { 64, 77, 64 },
                { 15, 19, 97 },
                { 4, 71, 57 },
                { 90, 86, 84 },
                { 93, 32, 91 }
        };
        assertEquals(208, rgbStreet.getMinCost(info2));
    }
}
