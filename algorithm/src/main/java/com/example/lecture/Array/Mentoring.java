package com.example.lecture.Array;

import java.util.Scanner;

public class Mentoring {

    public int mySolution(int N, int M, int[][] rankArr) {
        int pairs = 0;
        for (int p1 = 1; p1 < N; p1++) {
            for (int p2 = p1 + 1; p2 <= N; p2++) {
                boolean p1Mentor = true;
                boolean p2Mentor = true;
                int p1Loc = 0;
                int p2Loc = 0;
                for (int j = 0; j < M; j++) {
                    for (int k = 0; k < N; k++) {
                        if (p1 == rankArr[j][k])
                            p1Loc = k;
                        if (p2 == rankArr[j][k])
                            p2Loc = k;
                    }
                    if (p1Loc > p2Loc)
                        p1Mentor = false;
                    if (p2Loc > p1Loc)
                        p2Mentor = false;
                }
                if (p1Mentor || p2Mentor)
                    pairs++;
            }
        }
        return pairs;
    }

    public int teacherSolution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i)
                            pi = s;
                        if (arr[k][s] == j)
                            pj = s;
                    }
                    if (pi < pj)
                        cnt++;
                }
                if (cnt == m)
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Mentoring T = new Mentoring();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int M = kb.nextInt();

        int[][] rankArr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                rankArr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.mySolution(N, M, rankArr));
        // System.out.println(T.teacherSolution(N, M, rankArr));

        kb.close();
    }

}
