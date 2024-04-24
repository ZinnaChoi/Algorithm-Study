package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Treasure {

    public int getMinS(int N, int[] A, int[] B) {

        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += A[i] * B[N - 1 - i];
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Treasure T = new Treasure();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(T.getMinS(N, A, B));
    }
}
