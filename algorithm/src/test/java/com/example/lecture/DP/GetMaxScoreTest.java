package com.example.lecture.DP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.lecture.DP.GetMaxScore.Problem;

public class GetMaxScoreTest {

    @Test
    public void testSolution() {

        GetMaxScore getMaxScore = new GetMaxScore();

        // Test Case 1
        GetMaxScore.N = 5;
        GetMaxScore.M = 20;
        GetMaxScore.dp = new int[GetMaxScore.M + 1];
        List<GetMaxScore.Problem> problems1 = new ArrayList<>();
        problems1.add(new Problem(10, 5));
        problems1.add(new Problem(25, 12));
        problems1.add(new Problem(15, 8));
        problems1.add(new Problem(6, 3));
        problems1.add(new Problem(7, 4));

        int expected1 = 41;
        assertEquals(expected1, getMaxScore.getMaxScore(problems1));

        // Test Case 2
        GetMaxScore.N = 9;
        GetMaxScore.M = 50;
        GetMaxScore.dp = new int[GetMaxScore.M + 1];
        List<GetMaxScore.Problem> problems2 = new ArrayList<>();
        problems2.add(new Problem(12, 7));
        problems2.add(new Problem(16, 8));
        problems2.add(new Problem(20, 10));
        problems2.add(new Problem(30, 15));
        problems2.add(new Problem(10, 5));
        problems2.add(new Problem(25, 12));
        problems2.add(new Problem(15, 8));
        problems2.add(new Problem(6, 3));
        problems2.add(new Problem(7, 4));

        int expected2 = 101;
        assertEquals(expected2, getMaxScore.getMaxScore(problems2));
    }
}
