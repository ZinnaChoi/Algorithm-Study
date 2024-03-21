package com.example.lecture.DP;

import java.util.Scanner;

public class MaxPartialIncreaseSeq {

    static int N;
    static int[] arr;
    static int[] dp;

    public int getMaxLength(int N) {
        dp[0] = 1;
        int maxLength = 0;

        for (int i = 1; i < N; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && max < dp[j])
                    max = dp[j];
            }
            dp[i] = max + 1;
            maxLength = Math.max(dp[i], maxLength);
        }
        return maxLength;

    }

    public static void main(String[] args) {
        MaxPartialIncreaseSeq T = new MaxPartialIncreaseSeq();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        arr = new int[N];
        dp = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.getMaxLength(N));
        kb.close();
    }
}
