package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringHell {

    private static int N, M, K;
    private static char[][] map;
    private static int[][][] memo;
    private static final int MAX_WORD_LENGTH = 5;

    static final int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };

    public int DFS(int L, int x, int y, char[] target) {
        if (L == target.length - 1) {
            return 1;
        }
        if (memo[x][y][L] != -1) {
            return memo[x][y][L];
        }

        int cnt = 0;
        for (int[] d : dir) {
            int dx = (x + d[0] + N) % N;
            int dy = (y + d[1] + M) % M;
            if (map[dx][dy] == target[L + 1]) {
                cnt += DFS(L + 1, dx, dy, target);
            }
        }

        memo[x][y][L] = cnt;
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        StringHell T = new StringHell();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(" ");
        N = Integer.parseInt(nums[0]);
        M = Integer.parseInt(nums[1]);
        K = Integer.parseInt(nums[2]);

        map = new char[N][M];
        memo = new int[N][M][MAX_WORD_LENGTH];

        for (int n = 0; n < N; n++) {
            char[] words = br.readLine().toCharArray();
            for (int m = 0; m < M; m++) {
                map[n][m] = words[m];
            }
        }

        for (int i = 0; i < K; i++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    for (int l = 0; l < MAX_WORD_LENGTH; l++) {
                        memo[n][m][l] = -1;
                    }
                }
            }
            char[] target = br.readLine().toCharArray();
            int cnt = 0;
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (map[n][m] == target[0]) {
                        cnt += T.DFS(0, n, m, target);
                    }
                }
            }
            System.out.println(cnt);
        }
    }

}
