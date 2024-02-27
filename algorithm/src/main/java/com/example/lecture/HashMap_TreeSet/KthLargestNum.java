package com.example.lecture.HashMap_TreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class KthLargestNum {

    public int mySolution(int N, int k, int[] nums) {

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int l = j + 1; l < N; l++) {
                    set.add(nums[i] + nums[j] + nums[l]);
                }
            }
        }
        if (set.size() < k)
            return -1;

        Integer[] arr = set.toArray(new Integer[set.size()]);
        return arr[arr.length - k];
    }

    public int teacherSolution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 내림차순 정렬

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == k)
                return x;
        }

        return answer;
    }

    public static void main(String[] args) {
        KthLargestNum T = new KthLargestNum();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int k = kb.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = kb.nextInt();
        }

        System.out.println(T.mySolution(N, k, nums));

        kb.close();
    }

}