package com.example.prac.Lv2;

public class CntPrimeOfKNumber {

    private boolean isPrime(long num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // int 범위: -21억~21억
    public int solution(int n, int k) {
        int primeCnt = 0;
        for (String str : Integer.toString(n, k).split("0")) {
            if (!str.isEmpty()) {
                long number = Long.parseLong(str);
                if (isPrime(number)) {
                    primeCnt++;
                }
            }
        }
        return primeCnt;
    }
}