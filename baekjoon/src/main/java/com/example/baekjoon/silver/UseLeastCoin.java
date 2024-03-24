package com.example.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class UseLeastCoin {

    public int minCoinCnt(int[] coins, int K) {

        Arrays.sort(coins);
        int cnt = 0;

        while (K > 0) {
            for (int i = coins.length - 1; i >= 0; i--) {
                if (coins[i] > K)
                    continue;
                else {
                    cnt += K / coins[i];
                    K = K - (K / coins[i]) * coins[i];
                }

            }
        }

        return cnt;

    }

    public static void main(String[] args) {
        UseLeastCoin T = new UseLeastCoin();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int K = kb.nextInt();

        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = kb.nextInt();
        }

        System.out.println(T.minCoinCnt(coins, K));

        kb.close();
    }

}
