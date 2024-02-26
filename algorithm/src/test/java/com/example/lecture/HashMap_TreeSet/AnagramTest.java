package com.example.lecture.HashMap_TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnagramTest {
    @Test
    public void testSolution() {
        Anagram anagram = new Anagram();

        // Test case 1
        String result1 = anagram.mySolution("AbaAeCe", "baeeACA");
        assertEquals("YES", result1);

        // Test case 2
        String result2 = anagram.mySolution("ade", "bdd");
        assertEquals("NO", result2);
    }
}
