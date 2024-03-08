package com.example.lecture.SortingAndSearching;

import java.util.Scanner;

public class InsertSorting {

    public int[] mySolution(int N, int[] arr) {
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    for (int k = i; k > j; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[j] = tmp;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] main) {
        InsertSorting T = new InsertSorting();
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
