package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class DuplicatePermutation {

    public static int N;
    public static int M;
    public static int[] nums;
    public static int[] pm;

    public void TeacherDFS(int L) {
        if (L == M) {
            for (int x : pm)
                System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                pm[L] = i;
                TeacherDFS(L + 1);
            }
        }
    }

    public void DFS(int L, String picked) {

        if (L == M) {
            System.out.println(picked);
        } else {
            for (int i = 0; i < N; i++) {
                DFS(L + 1, picked + nums[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        DuplicatePermutation T = new DuplicatePermutation();
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        M = kb.nextInt();

        pm = new int[M];
        nums = new int[N];

        for (int i = 1; i <= N; i++) {
            nums[i - 1] = i;
        }

        // T.DFS(0, "");
        T.TeacherDFS(0);

        kb.close();
    }

}
