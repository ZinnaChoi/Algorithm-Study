package com.example.lecture.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParentheses {

    public String mySolution(String strs) {

        Stack<Character> st = new Stack<>();
        for (char c : strs.toCharArray()) {
            if (!st.isEmpty() && st.peek() == '(' && c == ')') {
                st.pop();
            } else {
                st.add(c);
            }
        }
        return st.size() == 0 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        CorrectParentheses T = new CorrectParentheses();
        Scanner kb = new Scanner(System.in);

        String strs = kb.next();
        System.out.println(T.mySolution(strs));

        kb.close();
    }
}
