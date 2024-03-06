package com.example.lecture.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EmergencyRoom {

    public class Patient {
        private int num;
        private int risk;

        public Patient(int num, int risk) {
            this.num = num;
            this.risk = risk;
        }
    }

    public int mySolution(int N, int M, int[] riskArr) {

        Queue<Patient> queue = new LinkedList<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            Patient p = new Patient(i, riskArr[i]);
            queue.add(p);
        }

        while (!queue.isEmpty()) {
            boolean isTurn = true;
            Patient cur = queue.poll();
            for (Patient p : queue) {
                if (cur.risk < p.risk) {
                    isTurn = false;
                    break;
                }
            }

            if (!isTurn)
                queue.add(cur);
            else {
                cnt++;
                if (cur.num == M)
                    return cnt;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        EmergencyRoom T = new EmergencyRoom();

        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int M = kb.nextInt();
        int[] riskArr = new int[N];

        for (int i = 0; i < N; i++) {
            riskArr[i] = kb.nextInt();
        }

        System.out.println(T.mySolution(N, M, riskArr));

        kb.close();
    }
}
