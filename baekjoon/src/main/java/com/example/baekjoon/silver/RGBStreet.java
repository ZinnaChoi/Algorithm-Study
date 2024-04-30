package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RGBStreet {

    static int N;

    public int getMinCost(int[][] info) {
        int[] R = new int[N + 1];
        int[] G = new int[N + 1];
        int[] B = new int[N + 1];

        for (int i = 0; i < N; i++) {
            R[i + 1] = Math.min(G[i], B[i]) + info[i][0];
            G[i + 1] = Math.min(R[i], B[i]) + info[i][1];
            B[i + 1] = Math.min(R[i], G[i]) + info[i][2];
        }
        return Math.min(R[N], Math.min(G[N], B[N]));
    }

    public static void main(String[] args) throws IOException {
        RGBStreet T = new RGBStreet();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int[][] info = new int[N][3];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                info[i][j] = Integer.parseInt(line[j]);
            }
        }
        System.out.println(T.getMinCost(info));
    }
}
