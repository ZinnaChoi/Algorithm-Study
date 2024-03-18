package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class GetPermutation {

    static int N;
    static int M;
    static int[] nums;
    static int[] visited;
    static int[] selected;

    public void DFS(int L) {
        if (L == M) {
            for (int s : selected) {
                System.out.print(s + " ");
            }
            System.out.println();

        } else {
            for (int i = 0; i < N; i++) {
                if (visited[i] == 1) {
                    continue;
                }
                selected[L] = nums[i];
                visited[i] = 1;
                DFS(L + 1);
                visited[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        GetPermutation T = new GetPermutation();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        M = kb.nextInt();

        nums = new int[N];
        visited = new int[N];
        selected = new int[M];

        for (int i = 0; i < N; i++) {
            nums[i] = kb.nextInt();
        }
        T.DFS(0);

        kb.close();
    }

}
