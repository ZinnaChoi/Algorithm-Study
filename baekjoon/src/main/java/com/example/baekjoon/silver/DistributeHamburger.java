package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.InputStreamReader;

public class DistributeHamburger {

    public int getMaxPeopleCnt(int N, int K, char[] loc) {
        int peopleCnt = 0;
        for (int i = 0; i < N; i++) {
            if (loc[i] == 'P') {
                for (int j = i - K; j <= i + K; j++) {
                    if (j >= 0 && j < N && loc[j] == 'H') {
                        loc[j] = 'E';
                        peopleCnt++;
                        break;
                    }
                }
            }
        }
        return peopleCnt;
    }

    public static void main(String[] args) throws IOException {
        DistributeHamburger T = new DistributeHamburger();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] line = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = line[0];
        int K = line[1];

        char[] loc = br.readLine().toCharArray();

        System.out.println(T.getMaxPeopleCnt(N, K, loc));

    }

}
