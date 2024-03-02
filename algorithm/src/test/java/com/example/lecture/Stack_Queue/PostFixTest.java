package com.example.lecture.Stack_Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PostFixTest {
    @Test
    public void testSolution() {
        Postfix postfix = new Postfix();

        // Test Case 1
        String postfix1 = "573*+5-323*++";
        int expected1 = 30;
        int result1 = postfix.mySolution(postfix1);
        assertEquals(expected1, result1);

        // Test Case 2
        String postfix2 = "352+*9-";
        int expected2 = 12;
        int result2 = postfix.mySolution(postfix2);
        assertEquals(expected2, result2);
    }
}
