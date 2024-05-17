package com.example.prac.Lv2;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Missile implements Comparable<Missile> {
    int start;
    int end;

    Missile(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Missile m) {
        return Integer.compare(this.end, m.end); // 종료시간 기준 오름차순 정렬
    }
}

public class ShootDownSystem {

    public int solution(int[][] targets) {
        List<Missile> missiles = new ArrayList<>();
        for (int[] t : targets)
            missiles.add(new Missile(t[0], t[1]));
        Collections.sort(missiles);

        double last = -1; // 요격 시간 초기화
        int missileCnt = 0;
        for (Missile m : missiles) {
            if (last < m.start) {
                missileCnt++;
                last = m.end - 0.1; // 현재 미사일 종료시간 직전에 요격
            }
        }

        return missileCnt;
    }
}
