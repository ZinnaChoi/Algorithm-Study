package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Turret {

    static class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static double getDistance(Point p1, Point p2) {
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;

        return Math.sqrt(dx * dx + dy * dy);

    }

    public int cntPoint(Point p1, int r1, Point p2, int r2) {

        double d = getDistance(p1, p2);

        if (d == 0) {
            if (r1 == r2)
                return -1;
            else
                return 0;
        } else {
            if (d == Math.abs(r1 - r2) || d == r1 + r2)
                return 1;

            else if (d > Math.abs(r1 - r2) && d < r1 + r2)
                return 2;

            else
                return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        Turret T = new Turret();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int[] lines = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Point p1 = new Point(lines[0], lines[1]);
            int r1 = lines[2];
            Point p2 = new Point(lines[3], lines[4]);
            int r2 = lines[5];

            System.out.println(T.cntPoint(p1, r1, p2, r2));
        }

    }
}
