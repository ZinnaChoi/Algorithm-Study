package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BigBuildTest {

    @Test
    public void testSolution() {

        int N = 5;
        List<BigBuild.Person> people = new ArrayList<>();
        people.add(new BigBuild.Person(55, 185));
        people.add(new BigBuild.Person(58, 183));
        people.add(new BigBuild.Person(88, 186));
        people.add(new BigBuild.Person(60, 175));
        people.add(new BigBuild.Person(46, 155));

        BigBuild bigBuild = new BigBuild();
        bigBuild.N = N;

        int[] actualRanks = bigBuild.getBuildRank(people);
        int[] expectedRanks = { 2, 2, 1, 2, 5 };

        assertArrayEquals(expectedRanks, actualRanks); // 예상값과 실제값을 비교
    }
}
