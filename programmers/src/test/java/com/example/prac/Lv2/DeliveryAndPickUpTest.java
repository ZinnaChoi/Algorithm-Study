package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DeliveryAndPickUpTest {

    @Test
    public void testSolution() {
        DeliveryAndPickUp deliveryAndPickUp = new DeliveryAndPickUp();

        // Test Case 1
        int cap1 = 4;
        int n1 = 5;
        int[] deliveries1 = { 1, 0, 3, 1, 2 };
        int[] pickups1 = { 0, 3, 0, 4, 0 };
        long result1 = deliveryAndPickUp.solution(cap1, n1, deliveries1, pickups1);
        assertEquals(16, result1, "Test Case 1 Failed");

        // Test Case 2
        int cap2 = 2;
        int n2 = 7;
        int[] deliveries2 = { 1, 0, 2, 0, 1, 0, 2 };
        int[] pickups2 = { 0, 2, 0, 1, 0, 2, 0 };
        long result2 = deliveryAndPickUp.solution(cap2, n2, deliveries2, pickups2);
        assertEquals(30, result2, "Test Case 2 Failed");
    }
}
