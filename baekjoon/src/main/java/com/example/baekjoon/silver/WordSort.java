package com.example.baekjoon.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordSort {

    public static class Word implements Comparable<Word> {

        public String w;

        public Word(String w) {
            this.w = w;
        }

        @Override
        public int compareTo(Word w) {
            if (this.w.length() == w.w.length())
                return this.w.compareTo(w.w);
            else
                return this.w.length() - w.w.length();

        }
    }

    public List<String> mySolution(int N, List<Word> words) {

        Collections.sort(words);

        List<String> uniqueWords = new ArrayList<>();
        for (Word word : words) {
            if (!uniqueWords.contains(word.w))
                uniqueWords.add(word.w);
        }

        return uniqueWords;
    }

    public static void main(String[] args) {
        WordSort T = new WordSort();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        List<Word> words = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            words.add(new Word(kb.next()));
        }

        for (String i : T.mySolution(N, words)) {
            System.out.println(i);
        }
        kb.close();
    }

}
