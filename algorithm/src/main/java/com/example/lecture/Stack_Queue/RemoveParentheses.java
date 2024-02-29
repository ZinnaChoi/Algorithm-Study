package com.example.lecture.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParentheses {

    public String mySolution(String strs) {
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        for (char c : strs.toCharArray()) {
            if (c == '(') {
                cnt++;
            } else if (c == ')') {
                cnt--;
            } else {
                if (cnt == 0)
                    sb.append(c);
            }
        }
        return sb.toString();
    }

    public String teacherSolution(String strs) {
        String answer = "";
        Stack<Character> st = new Stack<>();
        for (char c : strs.toCharArray()) {
            if (c != ')') {
                st.push(c);
            } else {
                while (st.pop() != '(')
                    ;
            }
        }
        for (int i = 0; i < st.size(); i++) {
            answer += st.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveParentheses T = new RemoveParentheses();
        Scanner kb = new Scanner(System.in);

        String strs = kb.next();
        System.out.println(T.mySolution(strs));

        kb.close();

    }

}
