package com.example.lecture.TwoPointerSlidingWindow;

import java.util.Scanner;

public class MaxLengthArray {

    public int mySolution(int N, int k, int[] arr) {

        int answer = 0;
        int lt = 0;
        int cnt = 0; // 0 -> 1인 횟수

        for (int rt = 0; rt < N; rt++) {
            if (arr[rt] == 0)
                cnt++;
            while (cnt > k) {
                if (arr[lt] == 0)
                    cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {

        MaxLengthArray T = new MaxLengthArray();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int k = kb.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.mySolution(N, k, arr));

        kb.close();
    }

}
