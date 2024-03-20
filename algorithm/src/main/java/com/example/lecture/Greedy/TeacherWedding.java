package com.example.lecture.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherWedding {

    static class Time implements Comparable<Time> {

        public int time;
        public char state;

        Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            if (this.time == o.time)
                return this.state - o.state;
            return this.time - o.time;
        }
    }

    public int teacherSolution(List<Time> times) {
        Collections.sort(times);
        int cnt = 0;
        int maxCnt = 0;

        for (Time t : times) {
            if (t.state == 'e')
                cnt--;
            else
                cnt++;

            if (cnt > maxCnt)
                maxCnt = cnt;
        }
        return maxCnt;

    }

    public static void main(String[] args) {
        TeacherWedding T = new TeacherWedding();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        List<Time> times = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            times.add(new Time(kb.nextInt(), 's'));
            times.add(new Time(kb.nextInt(), 'e'));
        }

        System.out.println(T.teacherSolution(times));

        kb.close();
    }

}
