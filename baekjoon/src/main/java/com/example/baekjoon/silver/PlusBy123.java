package com.example.baekjoon.silver;

import java.util.Scanner;

public class PlusBy123 {

    public int D(int n) {
        if (n == 1 || n == 2)
            return n;
        else if (n == 3)
            return 4;
        else
            return D(n - 1) + D(n - 2) + D(n - 3);
    }

    public static void main(String[] args) {
        PlusBy123 T = new PlusBy123();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = kb.nextInt();
        }

        for (int num : nums) {
            System.out.println(T.D(num));
        }
        kb.close();
    }
}
