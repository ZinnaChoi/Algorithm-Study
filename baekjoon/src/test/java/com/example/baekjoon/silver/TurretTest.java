package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TurretTest {

    @Test
    public void testSolution() {
        Turret turret = new Turret();

        // Test Case 1
        Turret.Point p1Case1 = new Turret.Point(0, 0);
        int r1Case1 = 13;
        Turret.Point p2Case1 = new Turret.Point(40, 0);
        int r2Case1 = 37;
        assertEquals(2, turret.cntPoint(p1Case1, r1Case1, p2Case1, r2Case1));

        // Test Case 2
        Turret.Point p1Case2 = new Turret.Point(0, 0);
        int r1Case2 = 3;
        Turret.Point p2Case2 = new Turret.Point(0, 7);
        int r2Case2 = 4;
        assertEquals(1, turret.cntPoint(p1Case2, r1Case2, p2Case2, r2Case2));

        // Test Case 3
        Turret.Point p1Case3 = new Turret.Point(1, 1);
        int r1Case3 = 1;
        Turret.Point p2Case3 = new Turret.Point(1, 1);
        int r2Case3 = 5;
        assertEquals(0, turret.cntPoint(p1Case3, r1Case3, p2Case3, r2Case3));
    }
}
