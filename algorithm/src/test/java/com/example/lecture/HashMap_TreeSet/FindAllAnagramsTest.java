package com.example.lecture.HashMap_TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindAllAnagramsTest {

    @Test
    public void testSolution() {
        FindAllAnagrams findAllAnagrams = new FindAllAnagrams();

        // Test Case 1
        String S1 = "ABCEFGHIJKLMNPQRSTUVWXYZabcaefghijklmnopqrstuvwxyz";
        String T1 = "abc";
        int expected1 = 2;
        int result1 = findAllAnagrams.mySolution(S1, T1);
        assertEquals(expected1, result1);

        // Test Case 2
        String S2 = "bacaAacba";
        String T2 = "abc";
        int expected2 = 3;
        int result2 = findAllAnagrams.mySolution(S2, T2);
        assertEquals(expected2, result2);
    }
}
