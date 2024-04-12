package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StartLink {

    static int N;
    static int[][] S;
    static int[] visited;
    static int minDiff = Integer.MAX_VALUE;

    public void DFS(int L, int start) {
        if (minDiff == 0)
            return;

        if (L == N / 2) {
            int s = 0, l = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (visited[i] == 1 && visited[j] == 1) {
                        s += S[i][j] + S[j][i];
                    } else if (visited[i] == 0 && visited[j] == 0) {
                        l += S[i][j] + S[j][i];
                    }
                }
            }
            minDiff = Math.min(minDiff, Math.abs(s - l));
        } else {
            for (int i = start; i < N; i++) {
                if (visited[i] == 0) {
                    visited[i] = 1;
                    DFS(L + 1, i + 1);
                    visited[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        StartLink T = new StartLink();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        visited = new int[N];
        S = new int[N][N];

        for (int i = 0; i < N; i++) {
            int[] lines = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < N; j++) {
                S[i][j] = lines[j];
            }
        }

        T.DFS(0, 0);
        System.out.println(minDiff);
    }
}