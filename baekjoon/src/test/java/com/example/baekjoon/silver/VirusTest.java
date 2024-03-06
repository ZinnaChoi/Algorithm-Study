package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class VirusTest {

    @Test
    public void testSolution() {
        Virus virus = new Virus();
        int N = 7;
        int[][] graph = new int[N + 1][N + 1];

        List<List<Integer>> linkedList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            linkedList.add(new ArrayList<>());
        }

        int[][] connections = {
                { 1, 2 },
                { 2, 3 },
                { 1, 5 },
                { 5, 2 },
                { 5, 6 },
                { 4, 7 }
        };

        for (int[] connection : connections) {
            int x = connection[0];
            int y = connection[1];
            graph[x][y] = 1;
            graph[y][x] = 1;

            linkedList.get(x).add(y);
            linkedList.get(y).add(x);
        }

        // 인접 행렬
        int result1 = virus.cntComputer(N, graph);
        // 인접 리스트
        int result2 = virus.cntComputer2(N, linkedList);

        assertEquals(4, result1);
        assertEquals(4, result2);
    }

}
