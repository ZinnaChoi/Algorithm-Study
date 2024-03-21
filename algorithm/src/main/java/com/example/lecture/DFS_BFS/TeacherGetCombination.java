package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class TeacherGetCombination {

    static int[] combi;
    static int n, m;

    public void DFS(int L, int s) {
        if (L == m) {
            for (int c : combi) {
                System.out.print(c + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        TeacherGetCombination T = new TeacherGetCombination();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        combi = new int[m];

        T.DFS(0, 1);
        kb.close();
    }
}
