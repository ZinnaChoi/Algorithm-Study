package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Padovan {

    private static final int MAX = 100;
    private static long[] padovan = new long[MAX + 1];

    public long getNthNum(int n) {
        if (n <= 3) {
            return 1;
        } else if (n <= 5) {
            return 2;
        }

        if (padovan[n] != 0) {
            return padovan[n];
        }

        padovan[n] = getNthNum(n - 1) + getNthNum(n - 5);
        return padovan[n];
    }

    public static void main(String[] args) throws IOException {
        Padovan P = new Padovan();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(P.getNthNum(n));
        }
    }

}
