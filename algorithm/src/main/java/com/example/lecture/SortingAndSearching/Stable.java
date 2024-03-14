package com.example.lecture.SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Stable {

    private boolean isAvailable(int C, int[] stable, int distance) {

        int cur = stable[0];
        int cnt = 1;

        for (int i = 1; i < stable.length; i++) {
            if (stable[i] - cur >= distance) {
                cnt++;
                cur = stable[i];
            }
            if (cnt == C)
                break;
        }

        return cnt == C ? true : false;
    }

    public int mySolution(int N, int C, int[] stable) {

        Arrays.sort(stable);

        int lt = 1;
        int rt = stable[N - 1] - stable[0];
        int mid = 0;

        while (lt <= rt) {
            mid = (lt + rt) / 2;
            if (isAvailable(C, stable, mid)) {
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return rt;
    }

    public static void main(String[] args) {
        Stable T = new Stable();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int C = kb.nextInt();

        int[] stable = new int[N];

        for (int i = 0; i < N; i++) {
            stable[i] = kb.nextInt();
        }

        System.out.println(T.mySolution(N, C, stable));

        kb.close();
    }

}
