package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LineUp {

    public int getMoveBackCnt(int[] tc) {
        int[] line = new int[21];
        int backCnt = 0;

        for (int i = 1; i <= 20; i++) {
            int cur = tc[i];
            int pos = 1;
            while (pos < i && line[pos] < cur) {
                pos++;
            }

            for (int j = i; j > pos; j--) {
                line[j] = line[j - 1];
            }

            line[pos] = cur;
            backCnt += (i - pos);
        }

        return backCnt;
    }

    public static void main(String[] args) throws IOException {
        LineUp T = new LineUp();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());

        for (int i = 0; i < P; i++) {
            int[] tc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(tc[0] + " " + T.getMoveBackCnt(tc));
        }

    }
}
