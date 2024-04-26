package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PettingPuppy {

    public int getMinNumberOfDays(int monkey, int puppy) {

        int diff = puppy - monkey;
        if (diff <= 3)
            return diff;

        int minDays = 2;
        diff -= 2;
        int cur = 1;

        while (diff > 0) {
            if (diff <= (cur + 1) * 2) {
                minDays++;
                if (diff > cur + 1) {
                    minDays++;
                }
                break;
            } else {
                diff = diff - (cur + 1) * 2;
                minDays += 2;
                cur++;
            }
        }

        return minDays;
    }

    public static void main(String[] args) throws IOException {
        PettingPuppy T = new PettingPuppy();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        System.out.println(T.getMinNumberOfDays(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
    }

}