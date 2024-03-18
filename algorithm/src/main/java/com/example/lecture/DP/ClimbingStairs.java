package com.example.lecture.DP;

import java.util.Scanner;

public class ClimbingStairs {

    public int dp(int N) {

        if (N == 1 || N == 2)
            return N;
        else {
            return dp(N - 1) + dp(N - 2);
        }
    }

    public static void main(String[] args) {
        ClimbingStairs T = new ClimbingStairs();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        System.out.println(T.dp(N));

        kb.close();
    }

}
