package com.example.baekjoon.gold;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.example.baekjoon.gold.MooTube.Edge;

public class MooTubeTest {

    @Test
    public void testSolution() {
        MooTube mo = new MooTube();

        int N = 4;
        ArrayList<ArrayList<MooTube.Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<MooTube.Edge>());
        }

        graph.get(1).add(new Edge(2, 3));
        graph.get(2).add(new Edge(1, 3));
        graph.get(2).add(new Edge(3, 2));
        graph.get(3).add(new Edge(2, 2));
        graph.get(2).add(new Edge(4, 4));
        graph.get(4).add(new Edge(2, 4));

        assertEquals(3, mo.BFS(graph, N, 2, 1));
        assertEquals(0, mo.BFS(graph, N, 1, 4));
        assertEquals(2, mo.BFS(graph, N, 1, 3));
    }
}
