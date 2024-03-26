package com.example.lecture.Greedy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsFriend {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visited;

    public String areTheyFriends(int s1, int s2) {

        Queue<Integer> Q = new LinkedList<>();

        visited[s1] = 1;
        for (int g : graph.get(s1)) {
            Q.offer(g);
        }

        while (!Q.isEmpty()) {
            int cur = Q.poll();
            for (int g : graph.get(cur)) {
                if (visited[g] == 0) {
                    if (g == s2)
                        return "YES";
                    Q.offer(g);
                    visited[g] = 1;
                }
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        IsFriend T = new IsFriend();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int M = kb.nextInt();
        visited = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int s1 = kb.nextInt();
        int s2 = kb.nextInt();

        System.out.println(T.areTheyFriends(s1, s2));

        kb.close();
    }

}
