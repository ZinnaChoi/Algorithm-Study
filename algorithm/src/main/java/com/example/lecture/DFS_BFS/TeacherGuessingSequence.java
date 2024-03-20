package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class TeacherGuessingSequence {

    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[11][11];

    public int comb(int n, int r) {
        if (dy[n][r] > 0)
            return dy[n][r];
        if (n == r | r == 0)
            return 1;
        else
            return dy[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
    }

    public void DFS(int L, int sum) {
        if (flag)
            return;
        if (L == n) {
            if (sum == f) {
                for (int x : p)
                    System.out.print(x + " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        TeacherGuessingSequence T = new TeacherGuessingSequence();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        f = kb.nextInt();

        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];

        for (int i = 0; i < n; i++) {
            b[i] = T.comb(n - 1, i);
        }

        T.DFS(0, 0);

        kb.close();
    }

}
