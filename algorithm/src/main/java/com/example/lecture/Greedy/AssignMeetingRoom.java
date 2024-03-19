package com.example.lecture.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AssignMeetingRoom {

    static class Meeting implements Comparable<Meeting> {

        private int start;
        private int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            if (this.end == o.end)
                return this.start - o.start;
            else
                return this.end - o.end;

        }
    }

    public int getMeetingCnt(int n, List<Meeting> info) {

        Collections.sort(info);
        int cnt = 1;
        int lastEndTime = info.get(0).end;

        for (int i = 1; i < n; i++) {
            if (info.get(i).start >= lastEndTime) {
                cnt++;
                lastEndTime = info.get(i).end;
            }

        }

        return cnt;
    }

    public static void main(String[] args) {
        AssignMeetingRoom T = new AssignMeetingRoom();
        Scanner kb = new Scanner(System.in);

        List<Meeting> info = new ArrayList<>();

        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            info.add(new Meeting(kb.nextInt(), kb.nextInt()));
        }

        System.out.println(T.getMeetingCnt(n, info));
        kb.close();
    }

}
