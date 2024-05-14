package com.example.prac.Lv2;

import java.util.Stack;

public class MakeBigNumber {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (char c : number.toCharArray()) {
            while (!st.isEmpty() && st.peek() < c && k > 0) {
                st.pop();
                k--;
            }
            st.push(c);
        }

        // ex) number = 54321 , k = 3
        while (k > 0) {
            st.pop();
            k--;
        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }

}
