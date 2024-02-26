package com.example.lecture.HashMap_TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClassPresidentTest {
    @Test
    public void testSolution() {
        ClassPresident classPresident = new ClassPresident();

        // Test Case 1
        int N1 = 20;
        char[] vote1 = "BDDAAAAEDCAACBAAABAC".toCharArray();
        char expected1 = 'A';
        assertEquals(expected1, classPresident.mySolution(N1, vote1));

        // Test Case 2
        int N2 = 30;
        char[] vote2 = "CECBBBABBBEDBCBAABDABBBABCEAEE".toCharArray();
        char expected2 = 'B';
        assertEquals(expected2, classPresident.mySolution(N2, vote2));
    }
}
