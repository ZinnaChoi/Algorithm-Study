package com.example.lecture.Stack_Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CurriculumDesignTest {

    @Test
    public void testSolution() {
        CurriculumDesign curriculumDesign = new CurriculumDesign();

        String require1 = "AKDEF";
        String design1 = "AYKGDHEJ";
        String expected1 = "NO";
        assertEquals(expected1, curriculumDesign.mySolution(require1, design1));

        String require2 = "CBA";
        String design2 = "CBDAGE";
        String expected2 = "YES";
        assertEquals(expected2, curriculumDesign.mySolution(require2, design2));
    }

}
