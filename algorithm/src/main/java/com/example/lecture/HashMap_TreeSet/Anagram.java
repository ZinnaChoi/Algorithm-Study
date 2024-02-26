package com.example.lecture.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public String mySolution(String w1, String w2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c1 : w1.toCharArray()) {
            map1.put(c1, map1.getOrDefault(c1, 0) + 1);
        }
        for (char c2 : w2.toCharArray()) {
            map2.put(c2, map2.getOrDefault(c2, 0) + 1);
        }

        if (map1.size() != map2.size())
            return "NO";

        for (char key1 : map1.keySet()) {
            if (map1.get(key1) != map2.getOrDefault(key1, 0)) {
                return "NO";
            }
        }
        return "YES";
    }

    public String teacherSolution(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(map, 0) + 1);
        }

        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0)
                return "NO";
            map.put(x, map.get(x) - 1);
        }
        return "YES";
    }

    public static void main(String[] args) {

        Anagram T = new Anagram();
        Scanner kb = new Scanner(System.in);

        String w1 = kb.next();
        String w2 = kb.next();
        System.out.println(T.mySolution(w1, w2));

        kb.close();
    }
}
