package com.example.lecture.HashMap_TreeSet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TypeOfSalesTest {

    @Test
    public void testSolution() {
        TypeOfSales tos = new TypeOfSales();
        int N1 = 20;
        int k1 = 10;
        int[] sales1 = { 365, 50, 50, 150, 60, 150, 154, 215, 150, 315, 293, 226, 408, 11, 344, 199, 313, 82, 394,
                304 };
        int[] expected1 = { 7, 7, 8, 8, 9, 9, 10, 10, 10, 10, 10 };
        int[] result1 = tos.mySolution(N1, k1, sales1);
        assertArrayEquals(expected1, result1);

        int N2 = 10;
        int k2 = 3;
        int[] sales2 = { 100, 15, 11, 20, 25, 10, 20, 19, 13, 15 };
        int[] expected2 = { 3, 3, 3, 3, 3, 3, 3, 3 };
        int[] result2 = tos.mySolution(N2, k2, sales2);
        assertArrayEquals(expected2, result2);
    }
}
