package com.example.prac.Lv2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BoxCount {

  public int solution(int[] order) {
    Stack<Integer> helpBelt = new Stack<>();
    Queue<Integer> mainBelt = new LinkedList<>();

    for (int i = 1; i <= order.length; i++) {
      mainBelt.add(i);
    }

    int idx = 0;
    int boxCnt = 0;
    while (!mainBelt.isEmpty()) {
      int cur = mainBelt.poll();
      if (cur == order[idx]) {
        boxCnt++;
        idx++;
      } else {
        helpBelt.push(cur);
      }

      while (!helpBelt.isEmpty() && helpBelt.peek() == order[idx]) {
        helpBelt.pop();
        boxCnt++;
        idx++;
      }
    }

    return boxCnt;
  }
}
