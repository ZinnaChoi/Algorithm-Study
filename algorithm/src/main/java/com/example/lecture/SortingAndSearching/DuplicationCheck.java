package com.example.lecture.SortingAndSearching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicationCheck {

    public Character mySolution(int N, int[] arr) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int a : arr) {
            if (map.containsKey(a))
                return 'D';
            else
                map.put(a, true);
        }
        return 'U';
    }

    public Character teacherSolution(int N, int[] arr) {

        Character answer = 'U';
        Arrays.sort(arr);

        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1])
                return 'D';
        }

        return answer;
    }

    public static void main(String[] args) {
        DuplicationCheck T = new DuplicationCheck();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = kb.nextInt();

        System.out.println(T.mySolution(N, arr));
        // System.out.println(T.teacherSolution(N, arr));

        kb.close();
    }
}
