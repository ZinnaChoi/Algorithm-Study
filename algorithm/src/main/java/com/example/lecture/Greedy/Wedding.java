package com.example.lecture.Greedy;

import java.util.Scanner;

public class Wedding {

    public int mySolution(int N, int[][] visitors) {

        int max = 0;
        int[] time = new int[73];

        for (int[] v : visitors) {
            for (int i = v[0]; i < v[1]; i++) {
                time[i]++;
            }
        }

        for (int t : time) {
            if (t > max)
                max = t;
        }
        return max;
    }

    public static void main(String[] args) {
        Wedding T = new Wedding();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[][] visitors = new int[N][2];

        for (int i = 0; i < N; i++) {
            visitors[i][0] = kb.nextInt();
            visitors[i][1] = kb.nextInt();
        }

        System.out.println(T.mySolution(N, visitors));

        kb.close();
    }
}
