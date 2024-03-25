package com.example.lecture.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeShortestPath {

    static int[][] maze = new int[7][7];
    static int[][] dir = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

    public class Location {
        public int x;
        public int y;
        public int len;

        Location(int x, int y, int len) {
            this.x = x;
            this.y = y;
            this.len = len;
        }
    }

    public int BFS() {

        maze[0][0] = 1;
        Queue<Location> Q = new LinkedList<>();
        Q.offer(new Location(0, 0, 0));

        while (!Q.isEmpty()) {
            Location cur = Q.poll();
            if (cur.x == 6 && cur.y == 6) {
                return cur.len;
            }
            for (int[] d : dir) {
                int dx = cur.x + d[0];
                int dy = cur.y + d[1];
                if (dx >= 0 && dy >= 0 && dx < 7 && dy < 7 && maze[dx][dy] == 0) {
                    Q.offer(new Location(dx, dy, cur.len + 1));
                    maze[dx][dy] = 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MazeShortestPath T = new MazeShortestPath();
        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {
                maze[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.BFS());

        kb.close();
    }

}
