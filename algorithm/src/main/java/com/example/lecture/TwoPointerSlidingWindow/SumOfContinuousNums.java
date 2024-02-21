package com.example.lecture.TwoPointerSlidingWindow;

import java.util.Scanner;

public class SumOfContinuousNums {

    public int mySolution(int N) {
        int sum = 0, cnt = 0;
        int start = 1;
        for (int i = 1; i <= N / 2 + 1; i++) {
            sum += i;
            while (sum >= N) {
                if (sum == N)
                    cnt++;
                sum -= start++;
            }
        }
        return cnt;
    }

    public int teacherSolution(int N) {
        // sum = lt ~ rt 까지의 합
        int answer = 0, sum = 0, lt = 0;
        int m = N / 2 + 1;

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == N)
                answer++;
            while (sum >= N) {
                sum -= arr[lt++];
                if (sum == N)
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfContinuousNums T = new SumOfContinuousNums();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        System.out.println(T.mySolution(N));

        kb.close();
    }
}
