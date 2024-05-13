package com.example.prac.Lv2;

public class VowelDictionary {
  private static final char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
  private boolean found = false;
  private int cnt = 0;

  private void DFS(String cur, String target) {
    if (cur.equals(target)) {
      found = true;
      return;
    }
    if (cur.length() >= 5)
      return;

    for (char c : vowels) {
      if (!found) {
        cnt++;
        DFS(cur + c, target);
      }
    }
  }

  public int solution(String word) {
    DFS("", word);
    return cnt;
  }

}
