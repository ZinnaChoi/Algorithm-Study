package com.example.lecture.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxRevenueSchedule {
    static class Lecture implements Comparable<Lecture> {

        public int money;
        public int period;

        Lecture(int money, int period) {
            this.money = money;
            this.period = period;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.period - this.period; // 내림차순
        }

    }

    public int getMaxIncome(List<Lecture> lectures) {
        Collections.sort(lectures);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int maxIncome = 0;
        int j = 0;
        int lastDay = lectures.get(0).period;

        for (int i = lastDay; i > 0; i--) {
            while (j < lectures.size() && lectures.get(j).period >= i) {
                pq.offer(lectures.get(j).money);
                j++;
            }
            if (!pq.isEmpty()) {
                maxIncome += pq.poll();
            }
        }

        return maxIncome;
    }

    public static void main(String[] args) {

        MaxRevenueSchedule T = new MaxRevenueSchedule();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        List<Lecture> lectures = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            lectures.add(new Lecture(kb.nextInt(), kb.nextInt()));
        }

        System.out.println(T.getMaxIncome(lectures));

        kb.close();
    }
}
