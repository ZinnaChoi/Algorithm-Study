package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BuildingBridge {

    public int cntBridge(int n, int k, int[][] comb) {
        if (k == 0 || n == k)
            return 1;
        else if (comb[n][k] > 0)
            return comb[n][k];
        else
            return comb[n][k] = cntBridge(n - 1, k - 1, comb) + cntBridge(n - 1, k, comb);
    }

    public static void main(String[] args) throws IOException {
        BuildingBridge B = new BuildingBridge();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[][] comb = new int[line[1] + 1][line[0] + 1];
            System.out.println(B.cntBridge(line[1], line[0], comb));
        }
    }

}
