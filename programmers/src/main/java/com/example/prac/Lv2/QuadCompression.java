package com.example.prac.Lv2;

public class QuadCompression {

    private void compress(int[][] arr, int[] cnt, int x, int y, int size) {
        if (size == 1) {
            cnt[arr[x][y]]++;
            return;
        }

        boolean isSame = true;
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != arr[x][y]) {
                    isSame = false;
                    break;
                }
            }
        }

        if (isSame) {
            cnt[arr[x][y]]++;
        } else {
            compress(arr, cnt, x, y, size / 2);
            compress(arr, cnt, x, y + size / 2, size / 2);
            compress(arr, cnt, x + size / 2, y, size / 2);
            compress(arr, cnt, x + size / 2, y + size / 2, size / 2);
        }
    }

    public int[] solution(int[][] arr) {
        int[] cnt = { 0, 0 };
        compress(arr, cnt, 0, 0, arr.length);
        return cnt;
    }
}
