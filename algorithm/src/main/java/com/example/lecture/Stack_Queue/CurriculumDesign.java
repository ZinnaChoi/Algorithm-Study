package com.example.lecture.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {

    public String mySolution(String require, String design) {
        Queue<Character> queue = new LinkedList<>();

        for (char r : require.toCharArray()) {
            queue.add(r);
        }

        for (char d : design.toCharArray()) {
            if (d == queue.peek()) {
                queue.poll();
            }
            if (queue.isEmpty())
                return "YES";
        }
        return "NO";
    }

    public String teacherSolution(String require, String design) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for (char r : require.toCharArray()) {
            queue.offer(r);
        }

        for (char x : design.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) // 선수과목 미이수
                    return "NO";
            }
        }
        if (!queue.isEmpty()) // 필수 과목 다 안들음
            return "NO";

        return answer;
    }

    public static void main(String[] args) {
        CurriculumDesign T = new CurriculumDesign();
        Scanner kb = new Scanner(System.in);

        String require = kb.next();
        String design = kb.next();

        System.out.println(T.mySolution(require, design));
        kb.close();
    }

}
