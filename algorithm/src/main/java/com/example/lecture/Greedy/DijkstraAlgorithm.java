package com.example.lecture.Greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class DijkstraAlgorithm {

    public class Point implements Comparable<Point> {
        public int node;
        public int cost;

        Point(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        public int compareTo(Point o) {
            return this.cost - o.cost;

        }
    }

    static int N, M;
    static int[][] graph;
    static int[] dis;
    static int[] visited;

    public void dijkstra(int start) {
        PriorityQueue<Point> Q = new PriorityQueue<>();
        dis[1] = 0;
        Q.offer(new Point(1, 0));

        while (!Q.isEmpty()) {
            Point cur = Q.poll();
            visited[cur.node] = 1;

            for (int i = 1; i <= N; i++) {
                if (graph[cur.node][i] > 0 && dis[i] > dis[cur.node] + graph[cur.node][i]) {
                    dis[i] = dis[cur.node] + graph[cur.node][i];
                    Q.offer(new Point(i, dis[i]));
                }
            }
        }
    }

    public static void main(String[] args) {
        DijkstraAlgorithm T = new DijkstraAlgorithm();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        M = kb.nextInt();
        dis = new int[N + 1];

        Arrays.fill(dis, Integer.MAX_VALUE);
        visited = new int[N + 1];

        graph = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            graph[kb.nextInt()][kb.nextInt()] = kb.nextInt();
        }

        T.dijkstra(1);

        for (int i = 2; i <= N; i++) {

            System.out.println(i + " : " + (dis[i] == Integer.MAX_VALUE ? "impossible" : dis[i]));
        }

        kb.close();
    }

}
