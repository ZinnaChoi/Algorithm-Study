package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoSolution {

    public int[] getBestSolutions(int[] nums) {

        Arrays.sort(nums);

        int lt = 0;
        int rt = nums.length - 1;
        int[] bestSolutions = new int[2];

        int smallestSum = Integer.MAX_VALUE;
        while (lt < rt) {
            int sum = nums[lt] + nums[rt];
            if (Math.abs(sum) < Math.abs(smallestSum)) {
                smallestSum = sum;
                bestSolutions[0] = nums[lt];
                bestSolutions[1] = nums[rt];

                if (sum == 0)
                    break;
            }

            if (sum < 0) {
                lt++;
            } else {
                rt--;
            }
        }

        return bestSolutions;
    }

    public static void main(String[] args) throws IOException {
        TwoSolution T = new TwoSolution();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int n : T.getBestSolutions(nums)) {
            System.out.print(n + " ");
        }
    }
}
