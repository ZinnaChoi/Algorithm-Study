package com.example.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class SortCoordinate {

    public int[][] sortedCoordinate(int N, int[][] loc) {

        Arrays.sort(loc, (a, b) -> {
            int compare = Integer.compare(a[0], b[0]);
            if (compare != 0) {
                return compare;
            } else {
                return Integer.compare(a[1], b[1]);
            }

        });

        return loc;
    }

    public static void main(String[] args) {
        SortCoordinate T = new SortCoordinate();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[][] loc = new int[N][2];

        for (int i = 0; i < N; i++) {
            loc[i][0] = kb.nextInt();
            loc[i][1] = kb.nextInt();
        }

        for (int[] x : T.sortedCoordinate(N, loc)) {
            System.out.println(x[0] + " " + x[1]);
        }
        kb.close();
    }
}
