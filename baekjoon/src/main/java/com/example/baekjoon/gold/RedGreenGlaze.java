package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class RedGreenGlaze {

    static int N;
    static char[][] map;
    static int[][] normalDist;
    static int[][] glazeDist;
    static int normalCnt = 0;
    static int glazeCnt = 0;

    static final int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    static class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void normalBFS(int x, int y) {

        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        normalDist[x][y] = normalCnt;

        while (!Q.isEmpty()) {
            Point cur = Q.poll();

            for (int[] d : dir) {
                int dx = cur.x + d[0];
                int dy = cur.y + d[1];

                if (dx >= 0 && dx < N && dy >= 0 && dy < N
                        && normalDist[dx][dy] == 0 && map[dx][dy] == map[cur.x][cur.y]) {
                    normalDist[dx][dy] = normalCnt;
                    Q.offer(new Point(dx, dy));
                }
            }
        }
    }

    public void glazeDFS(int x, int y) {

        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        glazeDist[x][y] = glazeCnt;

        while (!Q.isEmpty()) {
            Point cur = Q.poll();

            for (int[] d : dir) {
                int dx = cur.x + d[0];
                int dy = cur.y + d[1];

                if (dx >= 0 && dx < N && dy >= 0 && dy < N) {
                    boolean diff = false;
                    if (map[dx][dy] == 'B') {
                        if (map[cur.x][cur.y] != 'B')
                            diff = true;
                    } else {
                        if (map[cur.x][cur.y] == 'B')
                            diff = true;
                    }
                    if (glazeDist[dx][dy] == 0 && !diff) {
                        glazeDist[dx][dy] = glazeCnt;
                        Q.offer(new Point(dx, dy));
                    }
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        RedGreenGlaze T = new RedGreenGlaze();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        normalDist = new int[N][N];
        glazeDist = new int[N][N];

        for (int i = 0; i < N; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                map[i][j] = line[j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (normalDist[i][j] == 0) {
                    normalCnt++;
                    T.normalBFS(i, j);
                }

                if (glazeDist[i][j] == 0) {
                    glazeCnt++;
                    T.glazeDFS(i, j);
                }
            }
        }

        System.out.print(normalCnt + " " + glazeCnt);
    }
}
