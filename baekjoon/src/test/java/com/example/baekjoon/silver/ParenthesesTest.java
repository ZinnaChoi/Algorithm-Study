package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ParenthesesTest {

    @Test
    public void testSolution() {
        Parentheses parentheses = new Parentheses();

        assertEquals("NO", parentheses.isVPS("(())())"));
        assertEquals("NO", parentheses.isVPS("(((()())()"));
        assertEquals("YES", parentheses.isVPS("(()())((()))"));
        assertEquals("NO", parentheses.isVPS("((()()(()))(((())))()"));
        assertEquals("YES", parentheses.isVPS("()()()()(()()())()"));
        assertEquals("NO", parentheses.isVPS("(()((())()("));
    }
}
