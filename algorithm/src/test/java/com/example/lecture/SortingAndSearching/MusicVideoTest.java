package com.example.lecture.SortingAndSearching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MusicVideoTest {
    @Test
    public void testSolution() {
        MusicVideo musicVideo = new MusicVideo();

        // Test case 1
        int N1 = 10, M1 = 3;
        int[] arr1 = { 6, 5, 8, 5, 6, 8, 7, 6, 6, 7 };
        int expected1 = 24;
        assertEquals(expected1, musicVideo.mySolution(N1, M1, arr1));

        // Test case 2
        int N2 = 100, M2 = 10;
        int[] arr2 = { 8, 6, 7, 6, 8, 7, 8, 9, 5, 7, 5, 7, 5, 7, 7, 7, 8, 5, 7, 9, 7, 5, 9, 8, 6, 6, 8, 7, 5, 5, 5, 8,
                7, 5, 9, 7, 8, 6, 6, 8, 5, 9, 7, 5, 7, 8, 9, 7, 5, 7, 5, 8, 9, 5, 8, 9, 6, 9, 7, 6, 7, 6, 9, 7, 6, 9, 7,
                5, 7, 5, 6, 8, 5, 7, 9, 9, 6, 8, 9, 6, 5, 8, 6, 9, 6, 8, 8, 6, 9, 7, 8, 8, 7, 7, 6, 8, 6, 9, 5, 9 };
        int expected2 = 73;
        assertEquals(expected2, musicVideo.mySolution(N2, M2, arr2));
    }
}
