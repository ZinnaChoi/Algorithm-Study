package com.example.lecture.DP;

import java.util.Scanner;

public class ClimbingStairs {

    static int[] dy;

    public int dp(int N) {
        if (N == 1 || N == 2)
            return N;
        else {
            return dp(N - 1) + dp(N - 2);
        }
    }

    public int dp2(int N) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= N; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        return dy[N];
    }

    public static void main(String[] args) {
        ClimbingStairs T = new ClimbingStairs();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        dy = new int[N + 1];

        System.out.println(T.dp(N));
        // System.out.println(T.dp2(N));

        kb.close();
    }

}
