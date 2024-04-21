package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Walking {

    static long X, Y, W, S;
    static int minTime = Integer.MAX_VALUE;

    public long getMinTime(long X, long Y, long W, long S) {

        long onlyW = (X + Y) * W;

        Long onlyS = (X + Y) % 2 == 0 ? Math.max(X, Y) * S : (Math.max(X, Y) - 1) * S + W;

        long maxS = Math.min(X, Y) * S + Math.abs(X - Y) * W;

        return Math.min(onlyW, Math.min(onlyS, maxS));

    }

    public static void main(String[] args) throws IOException {
        Walking T = new Walking();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] nums = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        X = nums[0];
        Y = nums[1];
        W = nums[2];
        S = nums[3];

        System.out.println(T.getMinTime(X, Y, W, S));

    }
}
