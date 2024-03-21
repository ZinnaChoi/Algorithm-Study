package com.example.lecture.Greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.lecture.Greedy.MaxRevenueSchedule.Lecture;

public class MaxRevenueScheduleTest {

    @Test
    public void testSolution() {
        MaxRevenueSchedule maxRevenueSchedule = new MaxRevenueSchedule();

        List<MaxRevenueSchedule.Lecture> lectures = new ArrayList<>();
        lectures.add(new Lecture(50, 2));
        lectures.add(new Lecture(20, 1));
        lectures.add(new Lecture(40, 2));
        lectures.add(new Lecture(60, 3));
        lectures.add(new Lecture(30, 3));
        lectures.add(new Lecture(30, 1));

        int expected = 150;
        int actual = maxRevenueSchedule.getMaxIncome(lectures);
        assertEquals(expected, actual);
    }
}
