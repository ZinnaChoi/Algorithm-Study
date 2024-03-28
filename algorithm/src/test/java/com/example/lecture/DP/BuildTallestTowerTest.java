package com.example.lecture.DP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.lecture.DP.BuildTallestTower.Brick;

public class BuildTallestTowerTest {

    @Test
    public void testSolution() {
        BuildTallestTower buildTallestTower = new BuildTallestTower();
        BuildTallestTower.N = 5;
        BuildTallestTower.mh = new int[5];

        List<Brick> bricks = new ArrayList<>();

        bricks.add(new Brick(14, 5, 18));
        bricks.add(new Brick(19, 10, 5));
        bricks.add(new Brick(7, 12, 14));
        bricks.add(new Brick(5, 6, 19));
        bricks.add(new Brick(8, 13, 7));

        int expected = 18;
        int result = buildTallestTower.getMaxHeight(bricks);
        assertEquals(expected, result);

    }
}
