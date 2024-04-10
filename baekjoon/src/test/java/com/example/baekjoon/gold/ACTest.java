package com.example.baekjoon.gold;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ACTest {
    @Test
    public void testRDD() {
        AC ac = new AC();
        int[] arr = { 1, 2, 3, 4 };
        String result = ac.getResult("RDD", arr);
        assertEquals("[2,1]", result);
    }

    @Test
    public void testDD() {
        AC ac = new AC();
        int[] arr = { 42 };
        String result = ac.getResult("DD", arr);
        assertEquals("error", result);
    }

    @Test
    public void testRRD() {
        AC ac = new AC();
        int[] arr = { 1, 1, 2, 3, 5, 8 };
        String result = ac.getResult("RRD", arr);
        assertEquals("[1,2,3,5,8]", result);
    }

    @Test
    public void testDOnEmpty() {
        AC ac = new AC();
        int[] arr = {};
        String result = ac.getResult("D", arr);
        assertEquals("error", result);
    }
}
