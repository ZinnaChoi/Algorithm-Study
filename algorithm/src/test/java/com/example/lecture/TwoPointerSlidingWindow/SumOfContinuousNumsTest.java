package com.example.lecture.TwoPointerSlidingWindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfContinuousNumsTest {
    @Test
    public void testSolution() {
        SumOfContinuousNums sumOfContinuousNums = new SumOfContinuousNums();

        // Test case 1
        assertEquals(1, sumOfContinuousNums.mySolution(19));

        // Test case 2
        assertEquals(3, sumOfContinuousNums.mySolution(120));
    }
}
