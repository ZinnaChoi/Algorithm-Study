package com.example.baekjoon.silver;

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class PoppingBalloon {

    public static class Balloon {
        int position;
        int number;

        public Balloon(int position, int number) {
            this.position = position;
            this.number = number;
        }
    }

    public String popingOrder(int N, int[] papers) {
        Deque<Balloon> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            queue.offer(new Balloon(i + 1, papers[i]));
        }

        while (queue.size() > 1) {
            Balloon current = queue.poll();
            int move = current.number;
            sb.append(current.position + " ");

            if (move > 0) {
                move = move - 1;
            } else if (move < 0) {
                int size = queue.size();
                while (move < 0) {
                    move += size;
                }
            }

            for (int i = 0; i < move; i++) {
                queue.offer(queue.poll());
            }

        }

        sb.append(queue.poll().position);

        return sb.toString();
    }

    public static void main(String[] args) {
        PoppingBalloon T = new PoppingBalloon();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] papers = new int[N];

        for (int i = 0; i < N; i++) {
            papers[i] = kb.nextInt();
        }

        System.out.println(T.popingOrder(N, papers));

        kb.close();
    }

}
