package com.example.lecture.SortingAndSearching;

import java.util.Scanner;

public class SelectSorting {

    public int[] mySolution(int N, int[] arr) {

        for (int i = 0; i < N - 1; i++) {

            int cur = arr[i];
            int min = cur;
            int minIdx = 0;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            if (minIdx != 0) {
                arr[i] = min;
                arr[minIdx] = cur;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectSorting T = new SelectSorting();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = kb.nextInt();

        for (int i : T.mySolution(N, arr))
            System.out.print(i + " ");

        kb.close();

    }

}