package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class GetCombination {

    static int N;
    static int M;
    static int[] nums;
    static int[] visited;
    static int[] picked;

    public void DFS(int L, int max) {
        if (L == M) {
            for (int p : picked) {
                System.out.print(p + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < N; i++) {
                if (visited[i] == 0 && max < nums[i]) {
                    picked[L] = nums[i];
                    visited[i] = 1;
                    DFS(L + 1, nums[i]);
                    visited[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        GetCombination T = new GetCombination();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        M = kb.nextInt();

        nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = i + 1;
        }

        visited = new int[N];
        picked = new int[M];

        T.DFS(0, 0);

        kb.close();
    }

}
