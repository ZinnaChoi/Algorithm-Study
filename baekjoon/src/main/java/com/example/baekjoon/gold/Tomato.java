package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Tomato {

    static int M, N, H;
    static int[][][] box;
    static int[][][] dist;
    static Queue<Point> Q = new LinkedList<>();

    static final int[][] dirs = { { 0, 0, 1 }, { 0, 0, -1 }, { 0, 1, 0 }, { 0, -1, 0 }, { 1, 0, 0 },
            { -1, 0, 0 } };

    static class Point {
        private int h;
        private int n;
        private int m;

        Point(int h, int n, int m) {
            this.h = h;
            this.n = n;
            this.m = m;
        }
    }

    public void BFS() {
        while (!Q.isEmpty()) {
            Point cur = Q.poll();

            for (int[] dir : dirs) {
                int dh = cur.h + dir[0];
                int dn = cur.n + dir[1];
                int dm = cur.m + dir[2];
                if (dm >= 0 && dm < M && dn >= 0 && dn < N && dh >= 0 && dh < H && box[dh][dn][dm] == 0) {
                    box[dh][dn][dm] = 1;
                    dist[dh][dn][dm] = dist[cur.h][cur.n][cur.m] + 1;
                    Q.offer(new Point(dh, dn, dm));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Tomato T = new Tomato();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        M = Integer.parseInt(line[0]);
        N = Integer.parseInt(line[1]);
        H = Integer.parseInt(line[2]);

        box = new int[H][N][M];
        dist = new int[H][N][M];

        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                line = br.readLine().split(" ");
                for (int m = 0; m < M; m++) {
                    box[h][n][m] = Integer.parseInt(line[m]);
                    if (box[h][n][m] == 1) {
                        Q.offer(new Point(h, n, m));
                    }
                }
            }
        }

        T.BFS();

        int maxDays = 0;
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (box[h][n][m] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    maxDays = Math.max(maxDays, dist[h][n][m]);
                }
            }
        }

        System.out.println(maxDays);
    }

}
