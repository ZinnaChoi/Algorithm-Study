package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NewRecruit {

    public int getMaxRecruit(int N, int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 1;
        int minInterviewRank = arr[0][1];

        for (int i = 1; i < N; i++) {
            if (arr[i][1] < minInterviewRank) {
                count++;
                minInterviewRank = arr[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        NewRecruit T = new NewRecruit();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < K; j++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][2];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
            sb.append(T.getMaxRecruit(N, arr)).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}