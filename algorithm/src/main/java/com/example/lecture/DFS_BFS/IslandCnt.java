package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class IslandCnt {

    static int N;
    static int[][] map;
    static int[][] visited;
    static int[][] dir = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };

    public void DFS(int x, int y) {
        visited[x][y] = 1;

        for (int[] d : dir) {
            int dx = x + d[0];
            int dy = y + d[1];
            if (dx >= 0 && dx < N && dy >= 0 && dy < N && visited[dx][dy] == 0 && map[dx][dy] == 1) {
                DFS(dx, dy);
            }
        }
    }

    public static void main(String[] args) {
        IslandCnt T = new IslandCnt();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        map = new int[N][N];
        visited = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = kb.nextInt();
            }
        }

        int islandCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j] == 0 && map[i][j] == 1) {
                    T.DFS(i, j);
                    islandCount++;
                }
            }
        }

        System.out.println(islandCount);

        kb.close();
    }

}
