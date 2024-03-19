package com.example.lecture.Greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.lecture.Greedy.AssignMeetingRoom.Meeting;

public class AssignMeetingRoomTest {

    @Test
    public void testSolution() {
        AssignMeetingRoom assignMeetingRoom = new AssignMeetingRoom();

        List<Meeting> meetings1 = Arrays.asList(
                new Meeting(1, 4),
                new Meeting(2, 3),
                new Meeting(3, 5),
                new Meeting(4, 6),
                new Meeting(5, 7));
        int expected1 = 3;
        int result1 = assignMeetingRoom.getMeetingCnt(meetings1.size(), meetings1);
        assertEquals(expected1, result1);

        List<Meeting> meetings2 = Arrays.asList(
                new Meeting(3, 3),
                new Meeting(1, 3),
                new Meeting(2, 3),
                new Meeting(4, 6),
                new Meeting(5, 7));
        int expected2 = 3;
        int result2 = assignMeetingRoom.getMeetingCnt(meetings2.size(), meetings2);
        assertEquals(expected2, result2);
    }
}
