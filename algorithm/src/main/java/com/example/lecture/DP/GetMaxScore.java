package com.example.lecture.DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetMaxScore {

    static int N, M;
    static int[] dp;

    static class Problem {

        public int point;
        public int time;

        Problem(int point, int time) {
            this.point = point;
            this.time = time;
        }

    }

    public int getMaxScore(List<Problem> problems) {

        for (Problem p : problems) {
            for (int j = M; j - p.time >= 0; j--) {
                dp[j] = Math.max(dp[j], dp[j - p.time] + p.point);
            }
        }

        return dp[M];
    }

    public static void main(String[] args) {
        GetMaxScore T = new GetMaxScore();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        M = kb.nextInt();

        dp = new int[M + 1];

        List<Problem> problems = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            problems.add(new Problem(kb.nextInt(), kb.nextInt()));
        }

        System.out.println(T.getMaxScore(problems));

        kb.close();
    }

}
