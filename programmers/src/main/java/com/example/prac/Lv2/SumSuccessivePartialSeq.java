package com.example.prac.Lv2;

public class SumSuccessivePartialSeq {
    public int[] solution(int[] sequence, int k) {

        int n = sequence.length, start = 0, end = 0;
        int minLength = Integer.MAX_VALUE;
        int[] result = new int[2];

        int sum = sequence[0];
        while (start < n && end < n) {
            if (sum == k) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    result[0] = start;
                    result[1] = end;
                }
                sum -= sequence[start++];
            } else if (sum < k) {
                if (++end < n) {
                    sum += sequence[end];
                }
            } else {
                // sum > k
                sum -= sequence[start++];
            }
        }
        return result;
    }
}
