package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class SafeArea {

    static int N;
    static int[][] map;
    static int[][] area;
    static int maxSafeAreaCnt = 0;
    static final int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    static class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void BFS(int x, int y, int[][] visited) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        visited[x][y] = 1;

        while (!Q.isEmpty()) {
            Point cur = Q.poll();
            for (int[] d : dir) {
                int dx = cur.x + d[0];
                int dy = cur.y + d[1];

                if (dx >= 0 && dy >= 0 && dx < N && dy < N && visited[dx][dy] == 0 && area[dx][dy] == 0) {
                    visited[dx][dy] = 1;
                    Q.offer(new Point(dx, dy));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        SafeArea T = new SafeArea();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        int maxHeight = 0;

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(line[j]);
                map[i][j] = num;
                if (num > maxHeight)
                    maxHeight = num;
            }
        }

        area = new int[N][N];
        for (int h = 0; h <= maxHeight; h++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    area[i][j] = (map[i][j] <= h) ? 1 : 0;
                }
            }

            int safeCnt = 0;
            int[][] visited = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (area[i][j] == 0 && visited[i][j] == 0) {
                        T.BFS(i, j, visited);
                        safeCnt++;
                    }
                }
            }
            if (safeCnt > maxSafeAreaCnt)
                maxSafeAreaCnt = safeCnt;
        }

        System.out.println(maxSafeAreaCnt);

    }

}