package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MaxHeap {

    public List<Integer> printMax(int[] arr) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                answer.add(pq.size() > 0 ? pq.poll() : 0);
            } else {
                pq.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        MaxHeap T = new MaxHeap();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int a : T.printMax(arr)) {
            System.out.println(a);
        }
    }
}
