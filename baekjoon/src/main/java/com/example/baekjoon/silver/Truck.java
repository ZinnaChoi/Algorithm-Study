package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Truck {

    public int getMinTime(int n, int w, int L, int[] trucks) {
        Queue<Integer> bridge = new LinkedList<>();
        int currentWeight = 0;
        int time = 0;
        int index = 0;

        while (bridge.size() < w) {
            bridge.add(0);
        }

        while (index < n) {
            time++;
            currentWeight -= bridge.poll();

            if (currentWeight + trucks[index] <= L) {
                bridge.add(trucks[index]);
                currentWeight += trucks[index];
                index++;
            } else {
                bridge.add(0);
            }
        }

        return time + w;

    }

    public static void main(String[] args) throws IOException {
        Truck T = new Truck();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int w = Integer.parseInt(firstLine[1]);
        int L = Integer.parseInt(firstLine[2]);

        String[] secondLine = br.readLine().split(" ");
        int[] trucks = new int[n];
        for (int i = 0; i < n; i++) {
            trucks[i] = Integer.parseInt(secondLine[i]);
        }

        System.out.println(T.getMinTime(n, w, L, trucks));
    }
}
