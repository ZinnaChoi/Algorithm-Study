package com.example.lecture.Stack_Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SavingPrincessTest {

    @Test
    public void testSolution() {
        SavingPrincess savingPrincess = new SavingPrincess();

        // Test Case 1
        int N1 = 500, K1 = 8;
        int expected1 = 494;
        assertEquals(expected1, savingPrincess.mySolution(N1, K1));

        // Test Case 2
        int N2 = 700, K2 = 9;
        int expected2 = 212;
        assertEquals(expected2, savingPrincess.mySolution(N2, K2));
    }
}
