package com.example.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoNums {

    public int getPairCnt(int n, int x, int[] arr) {

        int cnt = 0;
        Arrays.sort(arr);

        int lt = 0, rt = n - 1;

        while (lt < rt) {
            if (arr[lt] + arr[rt] > x) {
                rt--;
            } else if (arr[lt] + arr[rt] < x) {
                lt++;
            } else {
                cnt++;
                lt++;
                rt--;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        SumOfTwoNums T = new SumOfTwoNums();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int x = kb.nextInt();

        System.out.println(T.getPairCnt(n, x, arr));
        kb.close();
    }
}
