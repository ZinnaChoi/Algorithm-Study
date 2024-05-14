package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TriangularSnailTest {

    @Test
    public void testSolution() {
        TriangularSnail ts = new TriangularSnail();

        assertArrayEquals(new int[] { 1, 2, 9, 3, 10, 8, 4, 5, 6, 7 }, ts.solution(4));
        assertArrayEquals(new int[] { 1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9 }, ts.solution(5));
        assertArrayEquals(new int[] { 1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11 },
                ts.solution(6));
    }

}
