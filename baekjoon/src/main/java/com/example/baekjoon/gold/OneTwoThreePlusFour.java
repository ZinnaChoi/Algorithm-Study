package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThreePlusFour {

    public int cntWays(int n) {

        if (n == 1 || n == 2 || n == 3)
            return n;

        int[][] dp = new int[n + 1][4];
        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i = 4; i <= n; i++) {
            dp[i][1] = dp[i - 1][1];
            dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
            dp[i][3] = dp[i - 3][1] + dp[i - 3][2] + dp[i - 3][3];
        }
        return dp[n][1] + dp[n][2] + dp[n][3];
    }

    public static void main(String[] args) throws IOException {
        OneTwoThreePlusFour T = new OneTwoThreePlusFour();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(T.cntWays(N));
        }
    }
}
