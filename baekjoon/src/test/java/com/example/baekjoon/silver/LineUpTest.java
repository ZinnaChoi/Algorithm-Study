package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineUpTest {

    @Test
    public void testMoveBackCnt() {
        LineUp lineup = new LineUp();
        assertEquals(0, lineup.getMoveBackCnt(new int[] { 0, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911,
                912, 913, 914, 915, 916, 917, 918, 919 }));
        assertEquals(190, lineup.getMoveBackCnt(new int[] { 0, 919, 918, 917, 916, 915, 914, 913, 912, 911, 910, 909,
                908, 907, 906, 905, 904, 903, 902, 901, 900 }));
        assertEquals(19, lineup.getMoveBackCnt(new int[] { 0, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911,
                912, 913, 914, 915, 916, 917, 918, 919, 900 }));
        assertEquals(171, lineup.getMoveBackCnt(new int[] { 0, 918, 917, 916, 915, 914, 913, 912, 911, 910, 909, 908,
                907, 906, 905, 904, 903, 902, 901, 900, 919 }));
    }

}
