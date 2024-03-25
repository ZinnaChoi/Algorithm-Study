package com.example.lecture.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TeacherMazeShortestPath {

    public class Point {
        public int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static int[][] board, dis;

    public int BFS() {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(0, 0));
        board[0][0] = 1;

        while (!Q.isEmpty()) {
            Point cur = Q.poll();
            if (cur.x == 6 && cur.y == 6) {
                return dis[6][6];
            }
            for (int i = 0; i < 4; i++) {
                int nextX = cur.x + dx[i];
                int nextY = cur.y + dy[i];
                if (nextX >= 0 && nextY >= 0 && nextX < 7 && nextY < 7 && board[nextX][nextY] == 0) {
                    board[nextX][nextY] = 1;
                    Q.offer(new Point(nextX, nextY));
                    dis[nextX][nextY] = dis[cur.x][cur.y] + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        TeacherMazeShortestPath T = new TeacherMazeShortestPath();
        Scanner kb = new Scanner(System.in);

        board = new int[7][7];
        dis = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.BFS());

        kb.close();
    }

}
