package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SugarDeliveryTest {

    @Test
    public void testSolution() {
        SugarDelivery sugarDelivery = new SugarDelivery();

        assertEquals(4, sugarDelivery.mySolution(18));
        assertEquals(-1, sugarDelivery.mySolution(4));
        assertEquals(2, sugarDelivery.mySolution(6));
        assertEquals(3, sugarDelivery.mySolution(11));
    }

}
