package com.example.lecture.DFS_BFS;

import java.util.Scanner;

public class CombinationCnt {

    public int comb(int n, int r) {
        if (r == 0 || n == r)
            return 1;
        return comb(n - 1, r - 1) + comb(n - 1, r);
    }

    public static void main(String[] args) {
        CombinationCnt T = new CombinationCnt();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int r = kb.nextInt();

        System.out.println(T.comb(n, r));

        kb.close();
    }

}
