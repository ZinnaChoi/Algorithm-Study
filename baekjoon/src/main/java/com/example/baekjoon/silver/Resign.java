
package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Resign {

    static class Consulting {
        private int day;
        private int term;
        private int price;

        Consulting(int day, int term, int price) {
            this.day = day;
            this.term = term;
            this.price = price;
        }
    }

    public int getMaxPrice(List<Consulting> consultings, int[] dp) {

        for (int i = 0; i < dp.length; i++) {
            Consulting cur = consultings.get(i);
            if (dp.length - cur.day < cur.term - 1) {
                dp[i] = 0;
            } else {
                int tmp = 0;
                for (int j = i; j >= 0; j--) {
                    if (consultings.get(j).term <= (i - j) && dp[j] + cur.price > tmp) {
                        tmp = dp[j] + cur.price;
                    }
                }
                dp[i] = Math.max(tmp, cur.price);
            }
        }

        int answer = 0;
        for (int d : dp) {
            if (d > answer)
                answer = d;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Resign T = new Resign();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Consulting> consultings = new ArrayList<>();
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            int[] lines = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            consultings.add(new Consulting(i + 1, lines[0], lines[1]));
        }
        System.out.println(T.getMaxPrice(consultings, dp));
    }
}
