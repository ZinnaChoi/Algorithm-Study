package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class MazeSearch {

    static int cnt = 0;
    static int[][] maze = new int[7][7];
    static int[][] visited = new int[7][7];
    static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public void DFS(int a, int b) {
        if (a == 6 && b == 6)
            cnt++;
        else {
            for (int[] d : dir) {
                if (a + d[0] >= 0 && a + d[0] < 7 && b + d[1] >= 0 && b + d[1] < 7
                        && maze[a + d[0]][b + d[1]] == 0
                        && visited[a + d[0]][b + d[1]] == 0) {
                    visited[a + d[0]][b + d[1]] = 1;
                    DFS(a + d[0], b + d[1]);
                    visited[a + d[0]][b + d[1]] = 0;
                }
            }

        }

    }

    public static void main(String[] args) {
        MazeSearch T = new MazeSearch();

        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                maze[i][j] = kb.nextInt();
            }
        }

        visited[0][0] = 1;
        T.DFS(0, 0);
        System.out.println(cnt);

        kb.close();
    }

}
