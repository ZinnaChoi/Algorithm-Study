package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MiniGameWithImsTest {

    @Test
    public void testSolution() {
        MiniGameWithIms game = new MiniGameWithIms();

        String type1 = "Y";
        String[] players1 = { "lms0806", "lms0806", "exponentiale", "lms0806", "jthis", "lms0806", "leo020630" };
        int expected1 = 4;
        assertEquals(expected1, game.playCnt(type1, players1));

        String type2 = "F";
        String[] players2 = { "lms0806", "powergee", "skeep194", "lms0806", "tony9402", "lms0806", "wider93",
                "lms0806", "mageek2guanaah", "lms0806", "jthis", "lms0806" };
        int expected2 = 3;
        assertEquals(expected2, game.playCnt(type2, players2));
    }
}
