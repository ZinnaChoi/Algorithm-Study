package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShortCut {

    static class Info implements Comparable<Info> {
        private int start;
        private int end;
        private int len;

        Info(int start, int end, int len) {
            this.start = start;
            this.end = end;
            this.len = len;
        }

        @Override
        public int compareTo(Info o) {
            if (this.start == o.start && this.end == o.end) {
                return this.len - o.len;
            } else if (this.end == o.end) {
                return this.start - o.start;
            } else {
                return this.end - o.end;
            }
        }
    }

    public int getMinLen(int N, int totalLen, List<Info> shortCutInfo) {

        Collections.sort(shortCutInfo);

        int[] dp = new int[totalLen + 1];

        for (int i = 1; i <= totalLen; i++) {
            dp[i] = dp[i - 1] + 1;
            for (Info info : shortCutInfo) {
                if (info.end == i && info.end - info.start > info.len) {
                    dp[i] = Math.min(dp[i], dp[info.start] + info.len);
                }
            }
        }

        return dp[totalLen];
    }

    public static void main(String[] args) throws IOException {
        ShortCut T = new ShortCut();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Info> shortCutInfo = new ArrayList<>();

        int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int N = line[0];
        int totalLen = line[1];

        for (int i = 0; i < N; i++) {
            int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            shortCutInfo.add(new Info(info[0], info[1], info[2]));
        }
        System.out.println(T.getMinLen(N, totalLen, shortCutInfo));
    }
}
