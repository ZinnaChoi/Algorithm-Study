package com.example.baekjoon.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GetArea {

    private static int M, N, K;
    private static int[][] map;
    private static int[][] visited;
    private static final int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public int calculateArea(int x, int y) {
        visited[x][y] = 1;
        int area = 1;

        for (int[] d : dir) {
            int dx = x + d[0];
            int dy = y + d[1];
            if (dx >= 0 && dx < M && dy >= 0 && dy < N && visited[dx][dy] == 0 && map[dx][dy] == 0) {
                area += calculateArea(dx, dy);
            }
        }
        return area;
    }

    public static void main(String[] args) {
        GetArea T = new GetArea();
        Scanner kb = new Scanner(System.in);

        M = kb.nextInt();
        N = kb.nextInt();
        K = kb.nextInt();

        map = new int[M][N];
        visited = new int[M][N];

        for (int i = 0; i < K; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            int d = kb.nextInt();

            for (int j = M - d; j < M - b; j++) {
                for (int q = a; q < c; q++) {
                    map[j][q] = 1;
                }
            }
        }

        List<Integer> widths = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0 && visited[i][j] == 0) {
                    widths.add(T.calculateArea(i, j));
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

        Collections.sort(widths);
        for (int w : widths)
            System.out.print(w + " ");

        kb.close();
    }

}
