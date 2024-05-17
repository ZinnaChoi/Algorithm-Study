package com.example.prac.Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakingStars {
    public static String[] solution(int[][] line) {
        List<int[]> points = new ArrayList<>();
        int n = line.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int A = line[i][0];
                int B = line[i][1];
                int E = line[i][2];
                int C = line[j][0];
                int D = line[j][1];
                int F = line[j][2];
                long denominator = A * D - B * C;

                if (denominator == 0)
                    continue;

                long xNumerator = B * F - E * D; // x = (BF - ED) / (AD - BC)
                long yNumerator = E * C - A * F; // y = (EC - AF) / (AD - BC)

                // 정수 좌표인지 확인
                if (xNumerator % denominator == 0 && yNumerator % denominator == 0) {
                    int x = (int) (xNumerator / denominator);
                    int y = (int) (yNumerator / denominator);
                    points.add(new int[] { x, y });
                }
            }
        }

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        // 격자판의 범위 찾기
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        int width = maxX - minX + 1;
        int height = maxY - minY + 1;

        // 별 그리기
        char[][] grid = new char[height][width];
        for (char[] row : grid) {
            Arrays.fill(row, '.');
        }

        for (int[] point : points) {
            int x = point[0] - minX;
            int y = maxY - point[1];
            grid[y][x] = '*';
        }

        String[] result = new String[height];
        for (int i = 0; i < height; i++) {
            result[i] = new String(grid[i]);
        }

        return result;
    }
}
