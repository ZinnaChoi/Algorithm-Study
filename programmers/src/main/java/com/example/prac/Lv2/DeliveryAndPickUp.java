package com.example.prac.Lv2;

public class DeliveryAndPickUp {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long totalDistance = 0;

        int deliverIdx = n - 1;
        int pickupIdx = n - 1;

        while (deliverIdx >= 0 || pickupIdx >= 0) {
            while (deliverIdx >= 0 && deliveries[deliverIdx] == 0) {
                deliverIdx--;
            }
            while (pickupIdx >= 0 && pickups[pickupIdx] == 0) {
                pickupIdx--;
            }

            int furthestIdx = Math.max(deliverIdx, pickupIdx);
            totalDistance += (furthestIdx + 1) * 2; // 왕복 거리

            // 배달 및 수거
            deliverIdx = process(deliveries, deliverIdx, cap);
            pickupIdx = process(pickups, pickupIdx, cap);
        }

        return totalDistance;
    }

    private int process(int[] tasks, int idx, int cap) {
        int currentLoad = 0;
        while (idx >= 0 && currentLoad < cap) {
            if (tasks[idx] + currentLoad <= cap) {
                currentLoad += tasks[idx];
                tasks[idx] = 0;
                idx--;
            } else {
                tasks[idx] -= (cap - currentLoad);
                currentLoad = cap;
            }
        }
        return idx;
    }
}
