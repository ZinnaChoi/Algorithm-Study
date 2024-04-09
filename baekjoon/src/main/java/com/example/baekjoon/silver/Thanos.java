package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thanos {

    public String removeHalf(String S) {

        int zeroCnt = 0, oneCnt = 0;

        for (char c : S.toCharArray()) {
            if (c == '0')
                zeroCnt++;
            else
                oneCnt++;
        }

        int z = 0, o = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char cur = S.charAt(i);
            if (cur == '0') {
                z++;
                if (z <= zeroCnt / 2) {
                    sb.append(cur);
                }
            } else {
                o++;
                if (o > oneCnt / 2) {
                    sb.append(cur);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Thanos T = new Thanos();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        System.out.println(T.removeHalf(S));

    }
}
