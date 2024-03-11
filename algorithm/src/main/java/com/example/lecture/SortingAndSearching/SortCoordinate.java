package com.example.lecture.SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortCoordinate {

    static class Point implements Comparable<Point> {
        public int x;
        public int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x)
                return this.y - o.y; // y 오름차순. 내림차순 시 return o.y - this.y;
            else
                return this.x - o.x; // x 오름차순. 내림차순 시 return o.x - this.x;
        }

    }

    public int[][] mySolution(int N, int[][] arr) {

        Arrays.sort(arr, (a, b) -> {
            int compare = Integer.compare(a[0], b[0]);
            if (compare != 0)
                return compare;
            else {
                return Integer.compare(a[1], b[1]);
            }
        });

        return arr;
    }

    public static void main(String[] args) {
        SortCoordinate T = new SortCoordinate();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[][] arr = new int[N][2];
        ArrayList<Point> arr2 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();

            arr[i][0] = x;
            arr[i][1] = y;
            arr2.add(new Point(x, y));
        }

        Collections.sort(arr2);
        for (Point o : arr2) {
            System.out.println(o.x + " " + o.y);
        }

        for (int[] a : T.mySolution(N, arr)) {
            System.out.println(a[0] + " " + a[1]);
        }

        kb.close();
    }

}
