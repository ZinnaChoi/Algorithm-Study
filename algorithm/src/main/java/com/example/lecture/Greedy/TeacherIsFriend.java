package com.example.lecture.Greedy;

import java.util.Scanner;

public class TeacherIsFriend {

    static int[] unf; // 서로소 집합.

    public static int Find(int v) {
        if (v == unf[v])
            return unf[v];
        else
            return unf[v] = Find(unf[v]); // 시간복잡도 감소
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb)
            unf[fa] = fb; // 두 사람의 집합 번호가 같아진다
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        unf = new int[n + 1];

        for (int i = 1; i <= n; i++)
            unf[i] = i; // 처음에는 학생의 수 만큼 서로소 집합의 수가 존재
        for (int i = 1; i <= m; i++) {
            Union(kb.nextInt(), kb.nextInt());
        }

        int fa = Find(kb.nextInt());
        int fb = Find(kb.nextInt());

        System.out.println(fa == fb ? "YES" : "NO");

        kb.close();

    }

}
