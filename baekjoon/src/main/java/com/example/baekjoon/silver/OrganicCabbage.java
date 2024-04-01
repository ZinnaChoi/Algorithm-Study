package com.example.baekjoon.silver;

import java.util.Scanner;

public class OrganicCabbage {

    static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public void DFS(int M, int N, int[][] loc, int[][] visited, int x, int y) {

        visited[x][y] = 1;

        for (int[] d : dir) {
            int dx = x + d[0];
            int dy = y + d[1];
            if (dx >= 0 && dx < N && dy >= 0 && dy < M && visited[dx][dy] == 0 && loc[dx][dy] == 1) {
                DFS(M, N, loc, visited, dx, dy);
            }
        }

    }

    public static void main(String[] args) {
        OrganicCabbage OC = new OrganicCabbage();
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
                        OC.DFS(M, N, loc, visited, p, q);
                        bugCnt++;
                    }
                }
            }
            System.out.println(bugCnt);
        }
        kb.close();
    }
}
