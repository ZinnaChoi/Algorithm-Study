package com.example.baekjoon.silver;

import java.util.Scanner;

public class Multiplication {

    public int getRemain(int A, int B, int C) {
        if (B == 0)
            return 1;

        long half = getRemain(A, B / 2, C);
        long temp = half * half % C;

        if (B % 2 == 0)
            return (int) temp;
        else {
            return (int) ((temp * A) % C);
        }
    }

    // half = A ^ (B/2) % C
    // 1) B가 짝수일 때
    // return half * half % C
    // 2) B가 홀수일 때
    // return half * half * A % C

    public static void main(String[] args) {
        Multiplication T = new Multiplication();
        Scanner kb = new Scanner(System.in);

        int A = kb.nextInt();
        int B = kb.nextInt();
        int C = kb.nextInt();

        System.out.println(T.getRemain(A, B, C));
        kb.close();
    }

}
