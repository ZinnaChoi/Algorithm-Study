package com.example.baekjoon.gold;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PettingPuppyTest {

    @Test
    public void testSolution() {

        PettingPuppy pettingPuppy = new PettingPuppy();

        // Test Case 1
        int start1 = 40;
        int end1 = 53;
        int expectedOutput1 = 7;
        int actualOutput1 = pettingPuppy.getMinNumberOfDays(start1, end1);
        assertEquals(expectedOutput1, actualOutput1);

        // Test Case 2
        int start2 = 40;
        int end2 = 52;
        int expectedOutput2 = 6;
        int actualOutput2 = pettingPuppy.getMinNumberOfDays(start2, end2);
        assertEquals(expectedOutput2, actualOutput2);
    }
}
