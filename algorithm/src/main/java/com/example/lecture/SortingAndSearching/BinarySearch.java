package com.example.lecture.SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public int mySolution(int N, int M, int[] arr) {

        Arrays.sort(arr);
        int lt = 0, rt = N - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] > M) {
                rt = mid - 1;
            } else if (arr[mid] < M) {
                lt = mid + 1;
            } else {
                return mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch T = new BinarySearch();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int M = kb.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.mySolution(N, M, arr));
        kb.close();
    }

}
