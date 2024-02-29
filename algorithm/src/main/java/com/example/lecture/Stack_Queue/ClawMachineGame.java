package com.example.lecture.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ClawMachineGame {

    public int mySolution(int N, int[][] arr, int[] moves) {

        Stack<Integer> st = new Stack<>();
        int pop = 0;

        for (int m : moves) {
            for (int i = 0; i < N; i++) {
                int cur = arr[i][m - 1];
                if (cur != 0) {
                    if (st.isEmpty() || st.peek() != cur) {
                        st.push(cur);
                    } else {
                        st.pop();
                        pop += 2;
                    }
                    arr[i][m - 1] = 0;
                    break;
                }
            }
        }
        return pop;
    }

    public static void main(String[] args) {
        ClawMachineGame T = new ClawMachineGame();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        int M = kb.nextInt();
        int[] moves = new int[M];

        for (int i = 0; i < M; i++) {
            moves[i] = kb.nextInt();
        }

        System.out.println(T.mySolution(N, arr, moves));

        kb.close();
    }

}
