package com.example.prac.Lv2;

public class TriangularSnail {

    static final int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, -1 } }; // 아래, 오른쪽, 위

    public int[] solution(int n) {

        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
        }

        int num = 1;
        int x = 0, y = 0; // 시작 위치
        int directionType = 0; // 0: 아래, 1: 오른쪽, 2: 위

        while (num <= n * (n + 1) / 2) {
            triangle[x][y] = num++;

            int newX = x + dir[directionType][0];
            int newY = y + dir[directionType][1];

            if (newX >= 0 && newX < n && newY >= 0 && newY <= newX && triangle[newX][newY] == 0) {
                x = newX;
                y = newY;
            } else {
                // 방향 전환
                directionType = (directionType + 1) % 3;
                x = x + dir[directionType][0];
                y = y + dir[directionType][1];
            }
        }

        int[] answer = new int[(n * (n + 1)) / 2];

        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[idx++] = triangle[i][j];
            }
        }

        return answer;
    }
}
