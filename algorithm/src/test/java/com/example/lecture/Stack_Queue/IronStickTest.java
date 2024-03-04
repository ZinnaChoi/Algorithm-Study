package com.example.lecture.Stack_Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IronStickTest {

    @Test
    public void testSolution() {
        IronStick ironStick = new IronStick();

        // Test Case 1
        String input1 = "(((()(()()))(())()))(()())";
        int expected1 = 24;
        assertEquals(expected1, ironStick.mySolution(input1));

        // Test Case 2
        String input2 = "(((()(()()))(())()))(()())(((()(()()))(())()))(()())(((()())))";
        int expected2 = 57;
        assertEquals(expected2, ironStick.mySolution(input2));
    }
}
