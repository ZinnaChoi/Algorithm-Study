package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CntZeroOneInFibo {

    static int[] zeroCnt;
    static int[] oneCnt;

    public int cntZero(int num) {
        if (num == 1)
            return 0;
        if (num == 0 || num == 2)
            return 1;
        else {
            if (zeroCnt[num] > 0)
                return zeroCnt[num];
            else {
                return zeroCnt[num] = cntZero(num - 1) + cntZero(num - 2);
            }
        }
    }

    public int cntOne(int num) {
        if (num == 0)
            return 0;
        if (num == 1 || num == 2)
            return 1;
        else {
            if (oneCnt[num] > 0)
                return oneCnt[num];
            else {
                return oneCnt[num] = cntOne(num - 1) + cntOne(num - 2);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        CntZeroOneInFibo T = new CntZeroOneInFibo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            zeroCnt = new int[num + 1];
            oneCnt = new int[num + 1];
            System.out.println(T.cntZero(num) + " " + T.cntOne(num));
        }
    }
}
