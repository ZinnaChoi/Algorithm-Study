package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Top {

    static class TopInfo {
        private int idx;
        private int height;

        TopInfo(int idx, int height) {
            this.idx = idx;
            this.height = height;
        }
    }

    public int[] receivedTop(List<TopInfo> tops) {
        int[] answer = new int[tops.size()];
        Stack<TopInfo> st = new Stack<>();

        for (int t = 0; t < tops.size(); t++) {
            TopInfo cur = tops.get(t);

            while (!st.isEmpty() && st.peek().height <= cur.height) {
                st.pop();
            }

            if (st.isEmpty()) {
                answer[t] = 0;
            } else {
                answer[t] = st.peek().idx;
            }

            st.push(cur);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Top T = new Top();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<TopInfo> tops = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            tops.add(new TopInfo(i + 1, Integer.parseInt(st.nextToken())));
        }

        for (int i : T.receivedTop(tops)) {
            System.out.print(i + " ");
        }

    }

}
