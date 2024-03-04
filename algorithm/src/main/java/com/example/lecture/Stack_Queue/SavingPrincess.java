package com.example.lecture.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavingPrincess {

    public int mySolution(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        int cnt = 0;
        while (queue.size() > 1) {
            cnt++;
            int prince = queue.poll();
            if (cnt == K) {
                cnt = 0;
            } else {
                queue.offer(prince);
            }
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        SavingPrincess T = new SavingPrincess();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int K = kb.nextInt();

        System.out.println(T.mySolution(N, K));

        kb.close();
    }

}
