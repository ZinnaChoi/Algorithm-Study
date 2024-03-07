package com.example.baekjoon.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TownNumbering {

    private final int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    private int dfs(int[][] map, int i, int j, int N, int townNum) {
        if (i < 0 || i >= N || j < 0 || j >= N || map[i][j] != 1) {
            return 0;
        }
        map[i][j] = townNum;
        int size = 1;
        for (int[] dir : dirs) {
            size += dfs(map, i + dir[0], j + dir[1], N, townNum);
        }
        return size;
    }

    public List<Integer> getTownInfo(int N, int[][] map) {

        List<Integer> townInfo = new ArrayList<>();
        int townNum = 2;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    int size = dfs(map, i, j, N, townNum);
                    townInfo.add(size);
                    townNum++;
                }
            }
        }
        Collections.sort(townInfo);
        townInfo.add(0, townInfo.size());
        return townInfo;

    }

    public static void main(String[] args) {
        TownNumbering T = new TownNumbering();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[][] map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = kb.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i : T.getTownInfo(N, map)) {
            System.out.println(i);
        }

        kb.close();
    }

}
