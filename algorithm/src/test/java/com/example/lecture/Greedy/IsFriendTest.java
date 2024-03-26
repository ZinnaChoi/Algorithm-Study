package com.example.lecture.Greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IsFriendTest {

    private IsFriend isFriend;

    @BeforeEach
    void setUp() {
        isFriend = new IsFriend();

        IsFriend.graph.clear();
        int N = 9;
        IsFriend.visited = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            IsFriend.graph.add(new ArrayList<>());
        }

        int[][] friendShip = {
                { 1, 2 },
                { 2, 3 },
                { 3, 4 },
                { 1, 5 },
                { 6, 7 },
                { 7, 8 },
                { 8, 9 },
        };

        for (int[] fs : friendShip) {
            IsFriend.graph.get(fs[0]).add(fs[1]);
            IsFriend.graph.get(fs[1]).add(fs[0]);
        }
    }

    @Test
    void testAreTheyFriends() {
        assertEquals("NO", isFriend.areTheyFriends(3, 8), "3과 8은 친구가 아니어야 합니다.");
        assertEquals("YES", isFriend.areTheyFriends(6, 9), "6과 9은 친구여야 합니다.");
    }

}
