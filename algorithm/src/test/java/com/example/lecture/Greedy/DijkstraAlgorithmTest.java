package com.example.lecture.Greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class DijkstraAlgorithmTest {

    @Test
    public void testSolution() {

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        int N = DijkstraAlgorithm.N = 6;
        DijkstraAlgorithm.graph = new int[N + 1][N + 1];
        DijkstraAlgorithm.dis = new int[N + 1];
        DijkstraAlgorithm.visited = new int[N + 1];
        Arrays.fill(DijkstraAlgorithm.dis, Integer.MAX_VALUE);

        DijkstraAlgorithm.graph[1][2] = 12;
        DijkstraAlgorithm.graph[1][3] = 4;
        DijkstraAlgorithm.graph[2][1] = 2;
        DijkstraAlgorithm.graph[2][3] = 5;
        DijkstraAlgorithm.graph[2][5] = 5;
        DijkstraAlgorithm.graph[3][4] = 5;
        DijkstraAlgorithm.graph[4][2] = 2;
        DijkstraAlgorithm.graph[4][5] = 5;
        DijkstraAlgorithm.graph[6][4] = 5;

        dijkstraAlgorithm.dijkstra(1);

        assertEquals(11, DijkstraAlgorithm.dis[2]);
        assertEquals(4, DijkstraAlgorithm.dis[3]);
        assertEquals(9, DijkstraAlgorithm.dis[4]);
        assertEquals(14, DijkstraAlgorithm.dis[5]);
        assertEquals(Integer.MAX_VALUE, DijkstraAlgorithm.dis[6]);
    }

}
