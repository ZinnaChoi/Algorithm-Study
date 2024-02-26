package com.example.lecture.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TypeOfSales {

    public int[] mySolution(int N, int k, int[] sales) {

        int[] salesType = new int[N - k + 1];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(sales[i], map.getOrDefault(sales[i], 0) + 1);
        }
        salesType[0] = map.size();

        for (int i = 0; i < N - k; i++) {
            if (map.get(sales[i]) > 1) {
                map.put(sales[i], map.get(sales[i]) - 1);
            } else {
                map.remove(sales[i]);
            }
            map.put(sales[i + k], map.getOrDefault(sales[i + k], 0) + 1);
            salesType[i + 1] = map.size();
        }
        return salesType;
    }

    public static void main(String[] args) {
        TypeOfSales T = new TypeOfSales();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int k = kb.nextInt();
        int[] sales = new int[N];

        for (int i = 0; i < N; i++) {
            sales[i] = kb.nextInt();
        }
        for (int i : T.mySolution(N, k, sales)) {
            System.out.print(i + " ");
        }
        kb.close();
    }
}
