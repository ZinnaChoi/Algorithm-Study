package com.example.lecture.DFS_BFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExchangeCoin {

    public static int N;
    public static int M;
    public static Integer[] type;
    public static Queue<int[]> Q = new LinkedList<>();

    public int BFS() {

        Q.offer(new int[] { 0, 0 });

        while (!Q.isEmpty()) {
            int[] current = Q.poll();
            int sum = current[0];
            int L = current[1];

            if (sum > M)
                continue;
            if (sum == M)
                return L;

            for (int t : type) {
                int nextSum = sum + t;
                if (nextSum <= M) {
                    Q.offer(new int[] { nextSum, L + 1 });
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ExchangeCoin T = new ExchangeCoin();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        type = new Integer[N];

        for (int i = 0; i < N; i++) {
            type[i] = kb.nextInt();
        }

        Arrays.sort(type, Collections.reverseOrder());

        M = kb.nextInt();
        System.out.println(T.BFS());
        kb.close();
    }

}
