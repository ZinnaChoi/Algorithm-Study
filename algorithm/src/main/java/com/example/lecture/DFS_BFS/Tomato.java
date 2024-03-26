package com.example.lecture.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {

    public class Point {

        public int x;
        public int y;
        public int day;

        Point(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    static int rareCnt = 0;
    static int N, M;
    static int[][] box;
    static final int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
    static Queue<Point> Q = new LinkedList<>();

    public int BFS() {

        int changeCnt = 0;

        while (!Q.isEmpty()) {
            Point cur = Q.poll();
            for (int[] d : dir) {
                int dx = cur.x + d[0];
                int dy = cur.y + d[1];
                if (dx >= 0 && dy >= 0 && dx < N && dy < M && box[dx][dy] == 0) {
                    box[dx][dy] = 1;
                    Q.offer(new Point(dx, dy, cur.day + 1));
                    changeCnt++;
                    if (changeCnt == rareCnt)
                        return cur.day + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Tomato T = new Tomato();
        Scanner kb = new Scanner(System.in);

        M = kb.nextInt();
        N = kb.nextInt();

        box = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int tomato = kb.nextInt();
                if (tomato == 0)
                    rareCnt++;
                else if (tomato == 1) {
                    Q.offer(T.new Point(i, j, 0));
                    box[i][j] = 1;
                }
                box[i][j] = tomato;
            }
        }
        System.out.println(T.BFS());

        kb.close();
    }

}
