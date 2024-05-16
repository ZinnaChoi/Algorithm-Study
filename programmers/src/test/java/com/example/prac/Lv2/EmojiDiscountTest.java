package com.example.prac.Lv2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class EmojiDiscountTest {

    @Test
    public void testSolution() {
        EmojiDiscount emojiDiscount = new EmojiDiscount();

        // Test case 1
        int[][] users1 = { { 40, 10000 }, { 25, 10000 } };
        int[] emoticons1 = { 7000, 9000 };
        int[] expected1 = { 1, 5400 };
        assertArrayEquals(expected1, emojiDiscount.solution(users1, emoticons1));

        // Test case 2
        int[][] users2 = { { 40, 2900 }, { 23, 10000 }, { 11, 5200 }, { 5, 5900 }, { 40, 3100 }, { 27, 9200 },
                { 32, 6900 } };
        int[] emoticons2 = { 1300, 1500, 1600, 4900 };
        int[] expected2 = { 4, 13860 };
        assertArrayEquals(expected2, emojiDiscount.solution(users2, emoticons2));
    }
}
