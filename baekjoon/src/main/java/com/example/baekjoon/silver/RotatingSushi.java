package com.example.baekjoon.silver;

import java.util.Scanner;

public class RotatingSushi {

    public int getMaxTypeCnt(int N, int d, int k, int c, int[] sushi) {
        int[] dishCount = new int[d + 1];
        int totalTypes = 0, maxTypes = 0;

        for (int i = 0; i < k; i++) {
            if (dishCount[sushi[i]] == 0)
                totalTypes++;
            dishCount[sushi[i]]++;
        }
        maxTypes = totalTypes;

        for (int i = 0; i < N; i++) {

            if (--dishCount[sushi[i]] == 0)
                totalTypes--;

            int nextDish = sushi[(i + k) % N];
            if (dishCount[nextDish] == 0)
                totalTypes++;
            dishCount[nextDish]++;

            if (dishCount[c] == 0) {
                maxTypes = Math.max(maxTypes, totalTypes + 1);
            } else {
                maxTypes = Math.max(maxTypes, totalTypes);
            }
        }
        return maxTypes;
    }

    public static void main(String[] args) {
        RotatingSushi T = new RotatingSushi();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int d = kb.nextInt();
        int k = kb.nextInt();
        int c = kb.nextInt();

        int[] sushi = new int[N];

        for (int i = 0; i < N; i++) {
            sushi[i] = kb.nextInt();
        }
        System.out.println(T.getMaxTypeCnt(N, d, k, c, sushi));

        kb.close();
    }

}
