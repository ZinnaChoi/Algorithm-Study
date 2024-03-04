package com.example.lecture.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {

    public int mySolution(String strs) {

        int stick = 0, answer = 0;
        char[] arr = strs.toCharArray();

        for (int i = 0; i < strs.length(); i++) {
            if (arr[i] == '(')
                stick++;
            else
                stick--;
            if (i != 0 && arr[i - 1] == '(' && arr[i] == ')') {
                answer += stick;
            } else if (arr[i] == ')') {
                answer++;
            }
        }
        return answer;
    }

    public int teacherSolution(String strs) {

        Stack<Character> st = new Stack<>();
        int answer = 0;

        for (int i = 0; i < strs.length(); i++) {
            if (strs.charAt(i) == '(')
                st.push('(');
            else {
                st.pop();
                if (strs.charAt(i - 1) == '(')
                    answer += st.size();
                else
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        IronStick T = new IronStick();
        Scanner kb = new Scanner(System.in);

        String strs = kb.next();
        System.out.println(T.teacherSolution(strs));

        kb.close();
    }
}
