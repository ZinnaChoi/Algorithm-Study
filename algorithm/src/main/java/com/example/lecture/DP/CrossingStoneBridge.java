package com.example.lecture.DP;

import java.util.Scanner;

public class CrossingStoneBridge {

    public int cntWay(int N) {
        if (N == 1 || N == 2)
            return 1;
        else
            return cntWay(N - 2) + cntWay(N - 1);
    }

    public static void main(String[] args) {
        CrossingStoneBridge T = new CrossingStoneBridge();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        System.out.println(T.cntWay(N + 2));

        kb.close();
    }
}
