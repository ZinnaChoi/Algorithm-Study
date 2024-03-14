package com.example.lecture.SortingAndSearching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StableTest {
    @Test
    public void testSolution() {
        Stable stable = new Stable();

        // Test case 1
        int[] stablePositions2 = { 1, 5, 9 };
        assertEquals(8, stable.mySolution(3, 2, stablePositions2));

        // Test case 2
        int[] stablePositions1 = { 8, 11, 18, 37, 57, 65, 83, 101, 112, 115, 129, 130, 146, 149, 153, 159, 166, 167,
                172, 191, 201, 205, 227, 228, 234, 272, 273, 282, 295, 319, 340, 394, 398, 399, 436, 446, 453, 481, 499,
                503, 611, 655, 680, 692, 718, 725, 726, 735, 739, 778, 811, 839, 841, 852, 867, 882, 907, 915, 923, 943,
                956, 967, 970, 989 };
        assertEquals(43, stable.mySolution(64, 19, stablePositions1));

    }
}
