package com.example.lecture.SortingAndSearching;

import java.util.Scanner;

public class LRU {

    public int[] mySolution(int S, int N, int[] works) {

        int[] memory = new int[S];

        for (int i = 0; i < N; i++) {
            boolean hit = false;
            for (int j = 0; j < S; j++) {
                if (memory[j] == works[i]) {
                    hit = true;
                    if (j != 0) {
                        for (int k = j - 1; k >= 0; k--) {
                            memory[k + 1] = memory[k];
                        }
                        memory[0] = works[i];
                    }
                }
            }
            if (!hit) {
                for (int j = S - 1; j > 0; j--) {
                    memory[j] = memory[j - 1];
                }
                memory[0] = works[i];
            }
        }
        return memory;
    }

    public static void main(String[] args) {
        LRU T = new LRU();
        Scanner kb = new Scanner(System.in);

        int S = kb.nextInt();
        int N = kb.nextInt();

        int[] works = new int[N];
        for (int i = 0; i < N; i++)
            works[i] = kb.nextInt();

        for (int i : T.mySolution(S, N, works))
            System.out.print(i + " ");

        kb.close();
    }
}
