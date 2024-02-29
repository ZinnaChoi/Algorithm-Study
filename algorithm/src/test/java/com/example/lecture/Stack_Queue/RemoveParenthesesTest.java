package com.example.lecture.Stack_Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveParenthesesTest {

    @Test
    public void testSolution() {
        RemoveParentheses removeParentheses = new RemoveParentheses();
        assertEquals("KDK", removeParentheses.mySolution("(AGKD)KDK(TKDM(KD))"));
        assertEquals("KDKDKFdkf", removeParentheses.mySolution("(AGKD)KDK(TKDM(KD))(ADKF(DK)DKF)DKF(dkf)dkf(d(D)dd)"));
    }
}
