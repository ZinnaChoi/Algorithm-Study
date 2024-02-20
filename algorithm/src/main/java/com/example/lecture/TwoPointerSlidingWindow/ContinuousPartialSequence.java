package com.example.lecture.TwoPointerSlidingWindow;

import java.util.Scanner;

public class ContinuousPartialSequence {

    public int mySolution(int N, int M, int[] arr) {

        int cnt = 0;
        int sum = 0;
        int start = 0;
        for (int end = 0; end < N; end++) {
            sum += arr[end];
            while (sum >= M) {
                if (sum == M)
                    cnt++;
                sum -= arr[start++];
            }
        }
        return cnt;
    }

    public int teacherSolution(int n, int m, int[] arr) {
        // sum = lt ~ rt 위치의 원소들의 합
        int lt = 0, cnt = 0, sum = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            while (sum >= m) {
                if (sum == m)
                    cnt++;
                sum -= arr[lt++];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        ContinuousPartialSequence T = new ContinuousPartialSequence();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int M = kb.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.mySolution(N, M, arr));
        // System.out.println(T.teacherSolution(N, M, arr));

        kb.close();
    }

}
