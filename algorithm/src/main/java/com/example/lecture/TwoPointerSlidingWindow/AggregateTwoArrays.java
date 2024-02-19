package com.example.lecture.TwoPointerSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class AggregateTwoArrays {

    public int[] mySolution(int N, int M, int[] arr1, int[] arr2) {

        int p = 0, p1 = 0, p2 = 0;
        int[] arr = new int[N + M];

        while (p < N + M) {
            if (p1 == N) {
                arr[p] = arr2[p2++];
            } else if (p2 == M) {
                arr[p] = arr1[p1++];
            } else if (arr1[p1] >= arr2[p2]) {
                arr[p] = arr2[p2++];
            } else {
                arr[p] = arr1[p1++];
            }
            p++;
        }
        return arr;
    }

    public ArrayList<Integer> teacherSolution(int n, int m, int[] a, int[] b) {

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2])
                answer.add(a[p1++]);
            else
                answer.add(b[p2++]);
        }

        while (p1 < n)
            answer.add(a[p1++]);
        while (p2 < m)
            answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args) {

        AggregateTwoArrays T = new AggregateTwoArrays();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] arr1 = new int[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = kb.nextInt();
        }

        int M = kb.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = kb.nextInt();
        }

        for (int i : T.mySolution(N, M, arr1, arr2)) {
            System.out.print(i + " ");
        }

        // for (int i : T.teacherSolution(N, M, arr1, arr2)) {
        // System.out.print(i + " ");
        // }
        kb.close();
    }

}