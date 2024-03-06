package com.example.baekjoon.silver;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Virus {

    public int cntComputer(int N, int[][] graph) {
        int cnt = 0;
        int[] visited = new int[N + 1];
        Queue<Integer> Q = new LinkedList<>();

        Q.add(1);
        visited[1] = 1;

        while (!Q.isEmpty()) {
            int tmp = Q.poll();
            for (int i = 1; i <= N; i++) {
                if (graph[tmp][i] == 1 && visited[i] == 0) {
                    Q.add(i);
                    visited[i] = 1;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public int cntComputer2(int N, List<List<Integer>> graph) {
        int cnt = 0;
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> Q = new LinkedList<>();

        Q.add(1);
        visited[1] = true;

        while (!Q.isEmpty()) {
            int tmp = Q.poll();
            for (int i = 0; i < graph.get(tmp).size(); i++) {
                int next = graph.get(tmp).get(i);
                if (!visited[next]) {
                    Q.add(next);
                    visited[next] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Virus T = new Virus();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int M = kb.nextInt();
        int[][] graph = new int[N + 1][N + 1];

        List<List<Integer>> linkedList = new LinkedList<>();
        for (int i = 0; i <= N; i++) {
            linkedList.add(new LinkedList<>());
        }

        for (int i = 0; i < M; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            graph[x][y] = 1;
            graph[y][x] = 1;

            linkedList.get(x).add(y);
            linkedList.get(y).add(x);
        }

        System.out.println(T.cntComputer(N, graph));
        System.out.println(T.cntComputer2(N, linkedList));

        kb.close();
    }

}
