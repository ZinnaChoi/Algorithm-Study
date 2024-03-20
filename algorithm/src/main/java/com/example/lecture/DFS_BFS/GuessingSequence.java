package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class GuessingSequence {

    static int[] arr;
    static int[] selected;
    static int[] visited;
    static int N;
    static int F;
    static boolean found = false;

    private int getF(int[] selected) {
        while (selected.length > 1) {
            int[] next = new int[selected.length - 1];

            for (int i = 0; i < selected.length - 1; i++) {
                next[i] = selected[i] + selected[i + 1];
            }
            selected = next;
        }
        return selected[0];

    }

    public void DFS(int L) {
        if (found)
            return;
        if (L == N) {
            if (getF(selected) == F) {
                for (int s : selected) {
                    System.out.print(s + " ");
                }
                found = true;
                return;
            }
        } else {
            for (int i = 0; i < N; i++) {
                if (visited[i] == 0) {
                    selected[L] = arr[i];
                    visited[i] = 1;
                    DFS(L + 1);
                    visited[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        GuessingSequence T = new GuessingSequence();

        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        F = kb.nextInt();

        arr = new int[N];
        selected = new int[N];
        visited = new int[N];

        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }

        T.DFS(0);

        kb.close();
    }

}
