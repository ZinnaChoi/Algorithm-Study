package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MakeBigNumberTest {

    @Test
    public void testSolution() {
        MakeBigNumber mbn = new MakeBigNumber();

        assertEquals("94", mbn.solution("1924", 2));
        assertEquals("3234", mbn.solution("1231234", 3));
        assertEquals("775841", mbn.solution("4177252841", 4));
    }
}
