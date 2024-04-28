package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parentheses {

    public String isVPS(String str) {

        Stack<Character> st = new Stack<>();
        for (char s : str.toCharArray()) {
            if (!st.isEmpty() && st.peek() == '(' && s == ')') {
                st.pop();
            } else {
                st.add(s);
            }
        }

        return st.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        Parentheses T = new Parentheses();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            System.out.println(T.isVPS(br.readLine()));
        }

    }
}
