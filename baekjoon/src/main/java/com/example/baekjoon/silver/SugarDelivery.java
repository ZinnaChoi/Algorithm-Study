package com.example.baekjoon.silver;

import java.util.Scanner;

public class SugarDelivery {

    public int mySolution(int N) {

        int cnt3 = 0;
        int cnt5 = N / 5;
        int left = N - (cnt5 * 5);

        if (left == 0)
            return cnt5;
        else {
            while (left <= N) {
                if (left % 3 == 0) {
                    cnt3 = left / 3;
                    return cnt3 + cnt5;
                }
                cnt5--;
                left += 5;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        SugarDelivery T = new SugarDelivery();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        System.out.println(T.mySolution(N));

        kb.close();

    }

}
