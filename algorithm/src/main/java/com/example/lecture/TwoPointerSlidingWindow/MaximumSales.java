package com.example.lecture.TwoPointerSlidingWindow;

import java.util.Scanner;

public class MaximumSales {

    public int mySolution(int N, int K, int[] hist) {
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += hist[i];
        }
        int maxSale = sum;

        for (int i = 0; i < N - K; i++) {
            sum -= hist[i];
            sum += hist[i + K];
            if (sum > maxSale)
                maxSale = sum;
        }
        return maxSale;
    }

    public int teacherSolution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;

        for (int i = 0; i < k; i++)
            sum += arr[i];
        answer = sum;

        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(sum, answer);
        }

        return answer;
    }

    public static void main(String[] args) {

        MaximumSales T = new MaximumSales();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int K = kb.nextInt();
        int[] hist = new int[N];

        for (int i = 0; i < N; i++) {
            hist[i] = kb.nextInt();
        }
        System.out.println(T.mySolution(N, K, hist));
        kb.close();
    }
}
