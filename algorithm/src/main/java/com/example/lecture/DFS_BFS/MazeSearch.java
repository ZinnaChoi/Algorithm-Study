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
                int da = a + d[0];
                int db = b + d[1];
                if (da >= 0 && da < 7 && db >= 0 && db < 7
                        && maze[da][db] == 0
                        && visited[da][db] == 0) {
                    visited[da][db] = 1;
                    DFS(da, db);
                    visited[da][db] = 0;
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
