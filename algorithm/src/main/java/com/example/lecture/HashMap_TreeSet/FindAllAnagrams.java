package com.example.lecture.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindAllAnagrams {

    public int mySolution(String S, String T) {

        int cnt = 0;
        int k = T.length();
        Map<Character, Integer> SMap = new HashMap<>();
        Map<Character, Integer> TMap = new HashMap<>();

        for (int i = 0; i < k; i++) {
            TMap.put(T.charAt(i), TMap.getOrDefault(T.charAt(i), 0) + 1);
            SMap.put(S.charAt(i), SMap.getOrDefault(S.charAt(i), 0) + 1);
        }

        if (SMap.equals(TMap)) // Map이 동일한지 equals() 를 사용해서 비교 가능
            cnt++;

        for (int i = 0; i < S.length() - k; i++) {
            if (SMap.get(S.charAt(i)) > 1) {
                SMap.put(S.charAt(i), SMap.get(S.charAt(i)) - 1);
            } else {
                SMap.remove(S.charAt(i));
            }
            SMap.put(S.charAt(i + k), SMap.getOrDefault(S.charAt(i + k), 0) + 1);
            if (SMap.equals(TMap))
                cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        FindAllAnagrams F = new FindAllAnagrams();
        Scanner kb = new Scanner(System.in);

        String S = kb.next();
        String T = kb.next();

        System.out.println(F.mySolution(S, T));
        kb.close();
    }

}
