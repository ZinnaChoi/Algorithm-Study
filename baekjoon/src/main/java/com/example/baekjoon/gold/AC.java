package com.example.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AC {

    public String getResult(String p, int[] arr) {
        int start = 0, end = arr.length - 1;
        boolean reverse = false;

        for (char c : p.toCharArray()) {
            if (c == 'R') {
                reverse = !reverse;
            } else {
                if (end < start)
                    return "error";
                if (reverse)
                    end--;
                else
                    start++;

            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (reverse) {
            for (int i = end; i >= start; i--) {
                sb.append(arr[i]);
                if (i > start)
                    sb.append(",");
            }
        } else {
            for (int i = start; i <= end; i++) {
                sb.append(arr[i]);
                if (i < end)
                    sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        AC ac = new AC();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());

            String arrString = br.readLine().replace("[",
                    "").replace("]", "");

            int[] arr = new int[n];
            if (arrString.length() > 0) {
                arr = Arrays.stream(arrString.split(",")).mapToInt(Integer::parseInt)
                        .toArray();

            }
            System.out.println(ac.getResult(p, arr));
        }
    }
}
