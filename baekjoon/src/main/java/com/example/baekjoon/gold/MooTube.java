package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MooTube {

    static class Edge {
        private int node;
        private int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    private int BFS(ArrayList<ArrayList<Edge>> graph, int N, int V, int K) {
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited[V] = true;

        int[] minUSADO = new int[N + 1];
        Arrays.fill(minUSADO, Integer.MAX_VALUE);
        minUSADO[V] = Integer.MAX_VALUE;

        int cnt = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (Edge edge : graph.get(cur)) {
                if (!visited[edge.node]) {
                    int value = Math.min(minUSADO[cur], edge.weight);

                    if (value >= K) {
                        queue.add(edge.node);
                        visited[edge.node] = true;
                        minUSADO[edge.node] = value;
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        MooTube T = new MooTube();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int N = nums[0];
        int Q = nums[1];

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Edge>());
        }

        for (int i = 0; i < N - 1; i++) {
            int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            graph.get(tmp[0]).add(new Edge(tmp[1], tmp[2]));
            graph.get(tmp[1]).add(new Edge(tmp[0], tmp[2]));
        }

        for (int i = 0; i < Q; i++) {
            int[] questions = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int K = questions[0];
            int V = questions[1];

            System.out.println(T.BFS(graph, N, V, K));
        }
    }
}
