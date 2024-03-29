package com.example.lecture.DP;

import java.util.Arrays;
import java.util.Scanner;

public class ExchangeCoin {

    static int N;
    static int[] coin;
    static int[] d;

    public int dp(int M) {

        Arrays.fill(d, Integer.MAX_VALUE);

        for (int c : coin)
            d[c] = 1;

        for (int i = 1; i <= M; i++) {
            for (int j = 0; j < N; j++) {
                if (i > coin[j] && d[i - coin[j]] != Integer.MAX_VALUE) {
                    d[i] = Math.min(d[i], d[i - coin[j]] + 1);
                }
            }
        }
        return d[M];

    }

    public static void main(String[] args) {
        ExchangeCoin T = new ExchangeCoin();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = kb.nextInt();
        }

        int M = kb.nextInt();
        d = new int[M + 1];

        System.out.println(T.dp(M));

        kb.close();
    }

}
