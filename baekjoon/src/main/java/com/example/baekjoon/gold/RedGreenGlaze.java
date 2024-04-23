package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class RedGreenGlaze {

    static int N;
    static char[][] map;
    static boolean[][] normalVisited;
    static boolean[][] glazeVisited;

    static final int[][] DIR = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void BFS(boolean[][] visited, int x, int y, boolean isGlaze) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point cur = queue.poll();

            for (int[] d : DIR) {
                int dx = cur.x + d[0];
                int dy = cur.y + d[1];

                if (dx >= 0 && dx < N && dy >= 0 && dy < N && !visited[dx][dy]) {
                    boolean isSame = !isGlaze
                            ? map[dx][dy] == map[cur.x][cur.y]
                            : !isDifferent(dx, dy, cur.x, cur.y);

                    if (isSame) {
                        visited[dx][dy] = true;
                        queue.offer(new Point(dx, dy));
                    }
                }
            }
        }
    }

    private boolean isDifferent(int x, int y, int curX, int curY) {
        return (map[x][y] == 'B' && map[curX][curY] != 'B')
                || (map[x][y] != 'B' && map[curX][curY] == 'B');
    }

    public static void main(String[] args) throws IOException {
        RedGreenGlaze T = new RedGreenGlaze();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        normalVisited = new boolean[N][N];
        glazeVisited = new boolean[N][N];

        int normalCnt = 0;
        int glazeCnt = 0;

        for (int i = 0; i < N; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                map[i][j] = line[j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!normalVisited[i][j]) {
                    normalCnt++;
                    T.BFS(normalVisited, i, j, false);
                }

                if (!glazeVisited[i][j]) {
                    glazeCnt++;
                    T.BFS(glazeVisited, i, j, true);
                }
            }
        }

        System.out.println(normalCnt + " " + glazeCnt);
    }
}