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

    static final int[][] DIR = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void BFS(int[][] dist, int x, int y, boolean isGlaze, int cnt) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        dist[x][y] = cnt;

        while (!Q.isEmpty()) {
            Point cur = Q.poll();

            for (int[] d : DIR) {
                int dx = cur.x + d[0];
                int dy = cur.y + d[1];

                if (dx >= 0 && dx < N && dy >= 0 && dy < N && dist[dx][dy] == 0) {
                    boolean shouldAdd = !isGlaze
                            ? map[dx][dy] == map[cur.x][cur.y]
                            : !isDifferent(dx, dy, cur.x, cur.y);

                    if (shouldAdd) {
                        dist[dx][dy] = cnt;
                        Q.offer(new Point(dx, dy));
                    }
                }
            }
        }
    }

    private boolean isDifferent(int x, int y, int dx, int dy) {
        return map[x][y] == 'B' && map[dx][dy] != 'B'
                || map[x][y] != 'B' && map[dx][dy] == 'B';
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
                    T.BFS(normalDist, i, j, false, normalCnt);
                }

                if (glazeDist[i][j] == 0) {
                    glazeCnt++;
                    T.BFS(glazeDist, i, j, true, glazeCnt);
                }
            }
        }

        System.out.println(normalCnt + " " + glazeCnt);
    }
}
