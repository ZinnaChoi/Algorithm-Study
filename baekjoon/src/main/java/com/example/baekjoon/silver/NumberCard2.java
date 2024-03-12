package com.example.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCard2 {

    public String mySolution(int[] cards, int[] nums) {
        Arrays.sort(cards);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            int start = lowerBound(cards, nums[i]);
            int end = upperBound(cards, nums[i]);
            sb.append(end - start + " ");
        }

        return sb.toString();
    }

    private int lowerBound(int[] cards, int target) {
        int lt = 0, rt = cards.length;
        while (lt < rt) {
            int mid = (lt + rt) / 2;
            if (cards[mid] < target) {
                lt = mid + 1;
            } else {
                rt = mid;
            }
        }
        return lt;
    }

    private int upperBound(int[] cards, int target) {
        int lt = 0, rt = cards.length;
        while (lt < rt) {
            int mid = (lt + rt) / 2;
            if (cards[mid] <= target) {
                lt = mid + 1;
            } else {
                rt = mid;
            }
        }
        return lt;
    }

    public static void main(String[] args) {

        NumberCard2 T = new NumberCard2();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = kb.nextInt();
        }

        int M = kb.nextInt();
        int[] nums = new int[M];

        for (int i = 0; i < M; i++) {
            nums[i] = kb.nextInt();
        }

        System.out.println(T.mySolution(cards, nums));

        kb.close();
    }
}
