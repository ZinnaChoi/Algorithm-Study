package com.example.lecture.SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {

    private boolean isAvailable(int M, int[] arr, int size) {

        int sum = 0;
        int cnt = 1;
        for (int a : arr) {
            if (sum + a <= size)
                sum += a;
            else {
                cnt++;
                sum = a;
            }
        }

        return cnt <= M ? true : false;
    }

    public int mySolution(int N, int M, int[] arr) {

        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (isAvailable(M, arr, mid)) {
                answer = mid;
                rt = mid - 1;
            } else
                lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        MusicVideo T = new MusicVideo();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int M = kb.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = kb.nextInt();

        System.out.println(T.mySolution(N, M, arr));

        kb.close();
    }
}
