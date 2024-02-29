package com.example.lecture.Stack_Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClawMachineGameTest {

    @Test
    public void testSolution() {
        ClawMachineGame clawMachineGame = new ClawMachineGame();

        int N1 = 6;
        int[][] arr1 = {
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 3, 1 },
                { 0, 2, 5, 0, 1, 1 },
                { 4, 2, 4, 4, 2, 3 },
                { 3, 5, 1, 3, 1, 3 },
                { 4, 2, 4, 4, 2, 3 }
        };
        int[] moves1 = { 1, 5, 3, 5, 1, 2, 1, 4, 3, 4 };
        assertEquals(6, clawMachineGame.mySolution(N1, arr1, moves1));

        int N2 = 5;
        int[][] arr2 = {
                { 0, 0, 0, 0, 0 },
                { 0, 0, 1, 0, 3 },
                { 0, 2, 5, 0, 1 },
                { 4, 2, 4, 4, 2 },
                { 3, 5, 1, 3, 1 }
        };
        int[] moves2 = { 1, 5, 3, 5, 1, 2, 1, 4 };
        assertEquals(4, clawMachineGame.mySolution(N2, arr2, moves2));
    }

}
