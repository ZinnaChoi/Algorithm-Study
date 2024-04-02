package com.example.baekjoon.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class OrganicCabbageBFS {

    static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    static class Point {
        public int x;
        public int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void BFS(int M, int N, int[][] loc, int[][] visited, int p, int q) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(p, q));
        visited[p][q] = 1;

        while (!Q.isEmpty()) {
            Point cur = Q.poll();

            for (int[] d : dir) {
                int dx = cur.x + d[0];
                int dy = cur.y + d[1];

                if (dx >= 0 && dx < N && dy >= 0 && dy < M && visited[dx][dy] == 0 && loc[dx][dy] == 1) {
                    visited[dx][dy] = 1;
                    Q.offer(new Point(dx, dy));
                }
            }
        }

    }

    public static void main(String[] args) {
        OrganicCabbageBFS OC = new OrganicCabbageBFS();
        Scanner kb = new Scanner(System.in);

        int T = kb.nextInt();
        for (int i = 0; i < T; i++) {

            int M = kb.nextInt();
            int N = kb.nextInt();
            int K = kb.nextInt();

            int[][] loc = new int[N][M];
            int[][] visited = new int[N][M];

            for (int k = 0; k < K; k++) {
                int x = kb.nextInt();
                int y = kb.nextInt();
                loc[y][x] = 1;
            }

            int bugCnt = 0;
            for (int p = 0; p < N; p++) {
                for (int q = 0; q < M; q++) {
                    if (visited[p][q] == 0 && loc[p][q] == 1) {
                        OC.BFS(M, N, loc, visited, p, q);
                        bugCnt++;
                    }
                }
            }
            System.out.println(bugCnt);
        }
        kb.close();
    }

}
