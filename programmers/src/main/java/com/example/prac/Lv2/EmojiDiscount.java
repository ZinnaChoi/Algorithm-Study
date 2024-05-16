package com.example.prac.Lv2;

public class EmojiDiscount {
    static int maxSubscribers = 0;
    static int maxSales = 0;
    static final int[] discounts = { 10, 20, 30, 40 }; // 총 조합의 수 4^7

    public int[] solution(int[][] users, int[] emoticons) {
        checkCombinations(users, emoticons, new int[emoticons.length], 0);
        return new int[] { maxSubscribers, maxSales };
    }

    private void checkCombinations(int[][] users, int[] emoticons, int[] currentDiscounts, int index) {

        // 이모티콘 별 할인률이 다 설정되면, 현재 조합의 최대 가입자수, 판매액을 구하고 update
        if (index == emoticons.length) {
            evaluate(users, emoticons, currentDiscounts);
            return;
        }

        // 이모티콘 별 할인율 설정
        for (int dis : discounts) {
            currentDiscounts[index] = dis;
            checkCombinations(users, emoticons, currentDiscounts, index + 1);
        }
    }

    private void evaluate(int[][] users, int[] emoticons, int[] currentDiscounts) {
        int subscribers = 0;
        int sales = 0;

        for (int[] user : users) {
            int userRate = user[0];
            int userThreshold = user[1];
            int totalCost = 0;

            for (int i = 0; i < emoticons.length; i++) {
                if (currentDiscounts[i] >= userRate) {
                    totalCost += emoticons[i] * (100 - currentDiscounts[i]) / 100;
                }
            }

            if (totalCost >= userThreshold) {
                subscribers++;
            } else {
                sales += totalCost;
            }
        }

        if (subscribers > maxSubscribers || (subscribers == maxSubscribers && sales > maxSales)) {
            maxSubscribers = subscribers;
            maxSales = sales;
        }
    }
}
