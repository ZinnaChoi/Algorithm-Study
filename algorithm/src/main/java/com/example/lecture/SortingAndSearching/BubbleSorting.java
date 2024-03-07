package com.example.lecture.SortingAndSearching;

import java.util.Scanner;

public class BubbleSorting {

    public int[] mySolution(int N, int[] arr) {

        for (int j = N - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSorting T = new BubbleSorting();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }

        for (int i : T.mySolution(N, arr))
            System.out.print(i + " ");

        kb.close();
    }

}
