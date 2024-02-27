package com.example.lecture.Stack_Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CorrectParenthesesTest {
    @Test
    public void testSolution() {
        CorrectParentheses correctParentheses = new CorrectParentheses();

        // Test case 1
        String input1 = "(())()";
        String expectedOutput1 = "YES";
        assertEquals(expectedOutput1, correctParentheses.mySolution(input1));

        // Test case 2
        String input2 = "((()())())))";
        String expectedOutput2 = "NO";
        assertEquals(expectedOutput2, correctParentheses.mySolution(input2));
    }
}
