package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShootDownSystemTest {

    @Test
    public void testSolution() {
        ShootDownSystem system = new ShootDownSystem();

        int[][] targets1 = { { 4, 5 }, { 4, 8 }, { 10, 14 }, { 11, 13 }, { 5, 12 }, { 3, 7 }, { 1, 4 } };
        assertEquals(3, system.solution(targets1));

        int[][] targets2 = { { 1, 3 }, { 2, 5 }, { 3, 6 } };
        assertEquals(2, system.solution(targets2));

        int[][] targets3 = { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };
        assertEquals(5, system.solution(targets3));
    }
}
