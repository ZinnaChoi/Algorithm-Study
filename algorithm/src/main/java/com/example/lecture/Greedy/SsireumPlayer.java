package com.example.lecture.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SsireumPlayer {

    static class Player implements Comparable<Player> {
        public int height;
        public int weight;

        Player(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Player o) {

            if (this.height == o.height) {
                return o.weight - this.weight;
            } else {
                return o.height - this.height;
            }
        }

    }

    public int mySolution(int N, List<Player> arr) {
        Collections.sort(arr);

        int tmpMax = arr.get(0).weight;
        int cnt = 1;

        for (Player a : arr) {
            if (a.weight > tmpMax) {
                cnt++;
                tmpMax = a.weight;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        SsireumPlayer T = new SsireumPlayer();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        List<Player> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(new Player(kb.nextInt(), kb.nextInt()));
        }

        System.out.println(T.mySolution(N, arr));

        kb.close();
    }

}
