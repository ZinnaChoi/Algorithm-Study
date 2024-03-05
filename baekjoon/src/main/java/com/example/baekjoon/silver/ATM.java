package com.example.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {

    public int getMinTime(int N, int[] arr) {

        int answer = 0, time = 0;
        Arrays.sort(arr);

        for (int i : arr) {
            time += i;
            answer += time;
        }

        return answer;
    }

    public static void main(String[] args) {
        ATM T = new ATM();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.getMinTime(N, arr));

        kb.close();
    }

}
