package com.example.lecture.Stack_Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmergencyRoomTest {

    @Test
    public void testSolution() {
        EmergencyRoom T = new EmergencyRoom();

        // Test case 1
        int N1 = 5, M1 = 2;
        int[] riskArr1 = { 60, 50, 70, 80, 90 };
        int expected1 = 3;
        assertEquals(expected1, T.mySolution(N1, M1, riskArr1));

        // Test case 2
        int N2 = 6, M2 = 3;
        int[] riskArr2 = { 70, 60, 90, 60, 60, 60 };
        int expected2 = 4;
        assertEquals(expected2, T.mySolution(N2, M2, riskArr2));
    }

}
