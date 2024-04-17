package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class CardSorting {

    public int getMinCnt(int N, int[] nums) {

        int minCnt = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : nums) {
            pq.offer(n);
        }

        while (pq.size() > 1) {
            int leastSum = pq.poll() + pq.poll();
            minCnt += leastSum;
            pq.offer(leastSum);
        }

        return minCnt;
    }

    public static void main(String[] args) throws IOException {
        CardSorting T = new CardSorting();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(T.getMinCnt(N, nums));
    }

}
