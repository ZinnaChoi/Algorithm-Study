package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.baekjoon.silver.ShortCut.Info;

public class ShortCutTest {

    @Test
    public void testSolution() {
        ShortCut sc = new ShortCut();
        List<ShortCut.Info> shortcuts1 = new ArrayList<>();
        shortcuts1.add(new Info(0, 50, 10));
        shortcuts1.add(new Info(0, 50, 20));
        shortcuts1.add(new Info(50, 100, 10));
        shortcuts1.add(new Info(100, 151, 10));
        shortcuts1.add(new Info(110, 140, 90));

        assertEquals(70, sc.getMinLen(5, 150, shortcuts1));

        List<ShortCut.Info> shortcuts2 = new ArrayList<>();
        shortcuts2.add(new Info(0, 10, 9));
        shortcuts2.add(new Info(20, 60, 45));
        shortcuts2.add(new Info(80, 190, 100));
        shortcuts2.add(new Info(50, 70, 15));
        shortcuts2.add(new Info(160, 180, 14));
        shortcuts2.add(new Info(140, 160, 14));
        shortcuts2.add(new Info(420, 901, 5));
        shortcuts2.add(new Info(450, 900, 0));

        assertEquals(432, sc.getMinLen(8, 900, shortcuts2));
    }
}
