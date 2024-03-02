package com.example.lecture.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public int mySolution(String postfix) {

        Stack<Integer> st = new Stack<>();
        for (char p : postfix.toCharArray()) {
            if (!Character.isDigit(p) && st.size() >= 2) {
                int beforeOne = st.pop();
                int beforeTwo = st.pop();
                if (p == '+') {
                    st.push((beforeTwo + beforeOne));
                } else if (p == '*') {
                    st.push((beforeTwo * beforeOne));
                } else if (p == '-') {
                    st.push((beforeTwo - beforeOne));
                } else {
                    st.push((beforeTwo / beforeOne));
                }

            } else {
                st.push(p - '0');
            }
        }
        return st.get(0);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Postfix T = new Postfix();

        String postfix = kb.next();

        System.out.println(T.mySolution(postfix));

        kb.close();
    }

}
