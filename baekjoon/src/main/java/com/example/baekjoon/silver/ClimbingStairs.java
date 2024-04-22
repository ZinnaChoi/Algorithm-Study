package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClimbingStairs {

    public int getMaxScore(int N, int[] stairs) {
        if (N == 1)
            return stairs[1];
        if (N == 2)
            return stairs[1] + stairs[2];
        if (N == 3)
            return Math.max(stairs[1] + stairs[3], stairs[2] + stairs[3]);

        int[] dp = new int[N + 1];
        dp[1] = stairs[1];
        dp[2] = stairs[1] + stairs[2];
        dp[3] = Math.max(stairs[1] + stairs[3], stairs[2] + stairs[3]);

        for (int i = 4; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i]);
        }

        return dp[N];
    }

    public static void main(String[] args) throws IOException {
        ClimbingStairs T = new ClimbingStairs();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] stairs = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(T.getMaxScore(N, stairs));
    }

}
