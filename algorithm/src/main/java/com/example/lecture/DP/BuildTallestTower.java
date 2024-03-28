package com.example.lecture.DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BuildTallestTower {

    static int N;
    static int[] mh; // max height

    public class Brick implements Comparable<Brick> {
        private int area;
        private int height;
        private int weight;

        Brick(int area, int height, int weight) {
            this.area = area;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Brick o) {
            return o.area - this.area;
        }
    }

    public int getMaxHeight(List<Brick> bricks) {
        Collections.sort(bricks);

        int answer = 0;
        mh[0] = bricks.get(0).height;

        for (int i = 1; i < N; i++) {
            int max = 0;
            Brick cur = bricks.get(i);

            for (int j = i - 1; j >= 0; j--) {
                if (cur.weight < bricks.get(j).weight) {
                    max = Math.max(mh[j], max);
                }
                mh[i] = max + cur.height;
            }
            answer = Math.max(answer, mh[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        BuildTallestTower T = new BuildTallestTower();
        Scanner kb = new Scanner(System.in);
        List<Brick> bricks = new ArrayList<>();
        N = kb.nextInt();
        mh = new int[N];

        for (int i = 0; i < N; i++) {
            bricks.add(T.new Brick(kb.nextInt(), kb.nextInt(), kb.nextInt()));
        }

        System.out.println(T.getMaxHeight(bricks));

        kb.close();
    }

}
