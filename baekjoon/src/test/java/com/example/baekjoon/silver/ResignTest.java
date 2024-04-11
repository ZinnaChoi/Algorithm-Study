package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ResignTest {

    private List<Resign.Consulting> prepareConsultings(int[][] data) {
        List<Resign.Consulting> consultings = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            consultings.add(new Resign.Consulting(i + 1, data[i][0], data[i][1]));
        }
        return consultings;
    }

    @Test
    public void testSolution() {
        Resign resign = new Resign();

        // Test case 1
        int[][] data1 = { { 3, 10 }, { 5, 20 }, { 1, 10 }, { 1, 20 }, { 2, 15 }, { 4, 40 }, { 2, 200 } };
        List<Resign.Consulting> consultings1 = prepareConsultings(data1);
        int[] dp1 = new int[data1.length];
        int expected1 = 45;
        assertEquals(expected1, resign.getMaxPrice(consultings1, dp1));

        // Test case 2
        int[][] data2 = { { 1, 1 }, { 1, 2 }, { 1, 3 }, { 1, 4 }, { 1, 5 }, { 1, 6 }, { 1, 7 }, { 1, 8 }, { 1, 9 },
                { 1, 10 } };
        List<Resign.Consulting> consultings2 = prepareConsultings(data2);
        int[] dp2 = new int[data2.length];
        int expected2 = 55;
        assertEquals(expected2, resign.getMaxPrice(consultings2, dp2));

        // Test case 3
        int[][] data3 = { { 5, 50 }, { 4, 40 }, { 3, 30 }, { 2, 20 }, { 1, 10 }, { 1, 10 }, { 2, 20 }, { 3, 30 },
                { 4, 40 }, { 5, 50 } };
        List<Resign.Consulting> consultings3 = prepareConsultings(data3);
        int[] dp3 = new int[data3.length];
        int expected3 = 90;
        assertEquals(expected3, resign.getMaxPrice(consultings3, dp3));
    }

}
