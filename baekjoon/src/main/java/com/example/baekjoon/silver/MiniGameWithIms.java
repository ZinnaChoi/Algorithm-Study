package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MiniGameWithIms {

    public int playCnt(String type, String[] players) {

        int answer = 0;
        Queue<String> playing = new LinkedList<>();
        Set<String> playerSet = new HashSet<>();

        // number of people
        int NOP = type.equals("Y") ? 1 : (type.equals("F") ? 2 : 3);

        for (String p : players) {
            if (!playerSet.contains(p)) {
                playing.add(p);
                if (playing.size() == NOP) {
                    playing.clear();
                    answer++;
                }
                playerSet.add(p);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        MiniGameWithIms T = new MiniGameWithIms();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] info = br.readLine().split(" ");

        int N = Integer.parseInt(info[0]);
        String type = info[1];

        String[] players = new String[N];

        for (int i = 0; i < N; i++) {
            players[i] = br.readLine();
        }

        System.out.println(T.playCnt(type, players));
    }
}
