package com.example.baekjoon.silver;

import java.util.Scanner;
import java.util.Stack;

public class ProvideSnack {

    public String mySolution(int N, int[] order) {

        int cur = 1;

        Stack<Integer> line = new Stack<>();
        Stack<Integer> stay = new Stack<>();

        for (int i = N - 1; i >= 0; i--) {
            line.push(order[i]);
        }

        while (!line.isEmpty() || !stay.isEmpty()) {
            if (!stay.isEmpty() && stay.peek() == cur) {
                stay.pop();
                cur++;
            } else if (!line.isEmpty()) {
                if (line.peek() == cur) {
                    line.pop();
                    cur++;
                } else {
                    stay.push(line.pop());
                }
            } else if ((!line.isEmpty() && line.peek() != cur) || (!stay.isEmpty() && stay.peek() != cur)) {
                return "Sad";
            }

        }

        return "Nice";
    }

    public static void main(String[] args) {

        ProvideSnack T = new ProvideSnack();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] order = new int[N];

        for (int i = 0; i < N; i++) {
            order[i] = kb.nextInt();
        }

        System.out.println(T.mySolution(N, order));

        kb.close();
    }

}
