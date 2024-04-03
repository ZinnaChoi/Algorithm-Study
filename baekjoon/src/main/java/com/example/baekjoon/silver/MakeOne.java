package com.example.baekjoon.silver;

import java.util.Scanner;

public class MakeOne {
    static int N;
    static int[] dp;

    public int getMinOperationCnt(int N) {

        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0)
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0)
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        return dp[N];
    }

    public static void main(String[] args) {
        MakeOne T = new MakeOne();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        dp = new int[N + 1];

        System.out.println(T.getMinOperationCnt(N));
        kb.close();
    }
}
