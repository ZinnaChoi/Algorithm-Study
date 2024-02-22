package com.example.lecture.TwoPointerSlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassPresident {

    public char mySolution(int N, char[] vote) {
        Map<Character, Integer> result = new HashMap<>();
        for (char v : vote) {
            result.put(v, result.getOrDefault(v, 0) + 1);
        }
        int maxCnt = Integer.MIN_VALUE;
        char president = ' ';

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            if (entry.getValue() > maxCnt) {
                maxCnt = entry.getValue();
                president = entry.getKey();
            }
        }
        return president;
    }

    public static void main(String[] args) {
        ClassPresident T = new ClassPresident();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        char[] vote = kb.next().toCharArray();

        System.out.println(T.mySolution(N, vote));
        kb.close();
    }

}
