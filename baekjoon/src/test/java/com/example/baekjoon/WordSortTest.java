package com.example.baekjoon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.baekjoon.silver.WordSort;
import com.example.baekjoon.silver.WordSort.Word;

public class WordSortTest {

    @Test
    public void testSolution() {

        WordSort wordSort = new WordSort();
        List<WordSort.Word> words = new ArrayList<>();

        words.add(new Word("but"));
        words.add(new Word("i"));
        words.add(new Word("wont"));
        words.add(new Word("hesitate"));
        words.add(new Word("no"));
        words.add(new Word("more"));
        words.add(new Word("no"));
        words.add(new Word("more"));
        words.add(new Word("it"));
        words.add(new Word("cannot"));
        words.add(new Word("wait"));
        words.add(new Word("im"));
        words.add(new Word("yours"));

        List<String> expected = List.of("i", "im", "it", "no", "but", "more", "wait", "wont", "yours", "cannot",
                "hesitate");
        List<String> actual = wordSort.mySolution(words.size(), words);

        assertEquals(expected, actual, "The sorted list does not match the expected output.");
    }
}
