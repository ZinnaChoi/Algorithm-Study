package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TellMiddlePart {

    public String tellMiddle(int[] arr) {

        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            if (minHeap.size() == maxHeap.size())
                maxHeap.offer(arr[i]);
            else
                minHeap.offer(arr[i]);

            if (!minHeap.isEmpty() && !maxHeap.isEmpty())
                if (minHeap.peek() < maxHeap.peek()) {
                    int tmp = minHeap.poll();
                    minHeap.offer(maxHeap.poll());
                    maxHeap.offer(tmp);
                }

            sb.append(maxHeap.peek() + "\n");
        }
        return sb.toString();

    }

    public static void main(String[] args) throws IOException {

        TellMiddlePart T = new TellMiddlePart();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(T.tellMiddle(arr));
    }

}
