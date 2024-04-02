package com.example.lecture.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IslandCntBFS {

    static int N;
    static int[][] map;
    static int[][] visited;
    static int[][] dir = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 }, { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } };
    static Queue<Point> Q = new LinkedList<>();

    static class Point {

        public int x;
        public int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void BFS(int x, int y) {
        Q.offer(new Point(x, y));
        visited[x][y] = 1;

        while (!Q.isEmpty()) {
            Point cur = Q.poll();

            for (int[] d : dir) {
                int dx = cur.x + d[0];
                int dy = cur.y + d[1];

                if (dx >= 0 && dx < N && dy >= 0 && dy < N && visited[dx][dy] == 0 && map[dx][dy] == 1) {
                    Q.offer(new Point(dx, dy));
                    visited[dx][dy] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        IslandCntBFS T = new IslandCntBFS();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();

        map = new int[N][N];
        visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = kb.nextInt();
            }
        }

        int islandCnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && visited[i][j] == 0) {
                    T.BFS(i, j);
                    islandCnt++;
                }
            }
        }

        System.out.println(islandCnt);
        kb.close();
    }

}
