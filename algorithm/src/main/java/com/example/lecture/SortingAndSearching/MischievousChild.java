package com.example.lecture.SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MischievousChild {

    public int[] mySolution(int N, int[] heights) {
        int[] answer = new int[2];
        int cnt = 0;
        int sameHeightCnt = 0;

        for (int i = 1; i < N; i++) {
            if (heights[i - 1] > heights[i]) {
                if (cnt == 0) {
                    answer[0] = i - sameHeightCnt;
                    answer[1] = i + 1;
                    cnt++;
                } else {
                    answer[1] = i + 1;
                    cnt++;
                    break;
                }
            }
            if (heights[i] == heights[i - 1]) {
                sameHeightCnt++;
            } else {
                sameHeightCnt = 0;
            }
        }

        if (answer[1] == 0) {
            answer[1] = answer[0] + 1;
        }

        return answer;
    }

    public ArrayList<Integer> teacherSolution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < N; i++) {
            if (arr[i] != tmp[i])
                answer.add(i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        MischievousChild T = new MischievousChild();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] heights = new int[N];

        for (int i = 0; i < N; i++)
            heights[i] = kb.nextInt();

        for (int i : T.mySolution(N, heights))
            System.out.print(i + " ");

        // for (int i : T.teacherSolution(N, heights))
        // System.out.print(i + " ");

        kb.close();
    }

}
