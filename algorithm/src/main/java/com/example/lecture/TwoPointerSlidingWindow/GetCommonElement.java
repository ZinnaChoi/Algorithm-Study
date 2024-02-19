package com.example.lecture.TwoPointerSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetCommonElement {

    public ArrayList<Integer> mySolution(int N, int M, int[] arr1, int[] arr2) {

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (p1 < N && p2 < M) {
            if (arr1[p1] < arr2[p2])
                p1++;
            else if (arr1[p1] > arr2[p2])
                p2++;
            else {
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        GetCommonElement T = new GetCommonElement();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];

        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i : T.mySolution(N, M, arr1, arr2)) {
            System.out.print(i + " ");
        }

        sc.close();
    }

}
