package com.example.lecture.DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BuildTallestTower {

    static int N;
    static int[] h; // height
    static int[] tw; // top weight

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
        int maxHeight = 0;

        for (int i = 1; i <= N; i++) {
            Brick cur = bricks.get(i - 1);

            if (cur.weight < tw[i - 1] || i == 1) {
                h[i] = h[i - 1] + cur.height;
                tw[i] = cur.weight;
            } else {
                int tmp = 0;
                for (int j = i - 1; j > 0; j--) {
                    if (tw[j] > cur.weight) {
                        tmp = j;
                        break;
                    }
                }
                if (h[tmp] + cur.height < h[i - 1]) {
                    h[i] = h[tmp] + cur.height;
                    tw[i] = cur.weight;
                } else {
                    h[i] = h[i - 1];
                    tw[i] = tw[i - 1];
                }
            }
            maxHeight = Math.max(h[i], maxHeight);
        }

        return maxHeight;
    }

    public static void main(String[] args) {
        BuildTallestTower T = new BuildTallestTower();
        Scanner kb = new Scanner(System.in);
        List<Brick> bricks = new ArrayList<>();
        N = kb.nextInt();
        h = new int[N + 1];
        tw = new int[N + 1];

        for (int i = 0; i < N; i++) {
            bricks.add(T.new Brick(kb.nextInt(), kb.nextInt(), kb.nextInt()));
        }

        System.out.println(T.getMaxHeight(bricks));

        kb.close();
    }

}
