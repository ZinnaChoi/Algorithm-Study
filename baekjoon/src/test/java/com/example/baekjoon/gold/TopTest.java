package com.example.baekjoon.gold;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import com.example.baekjoon.gold.Top.TopInfo;

import org.junit.jupiter.api.Test;

public class TopTest {

    @Test
    public void testSolution() {
        Top top = new Top();
        List<Top.TopInfo> tops = new ArrayList<>();
        tops.add(new TopInfo(1, 6));
        tops.add(new TopInfo(2, 9));
        tops.add(new TopInfo(3, 5));
        tops.add(new TopInfo(4, 7));
        tops.add(new TopInfo(5, 4));

        int[] expected = { 0, 0, 2, 2, 4 };
        int[] actual = top.receivedTop(tops);

        assertArrayEquals(expected, actual);
    }
}
