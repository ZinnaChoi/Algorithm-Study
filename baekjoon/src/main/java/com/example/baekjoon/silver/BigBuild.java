package com.example.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BigBuild {

    static int N;

    static class Person {
        private int weight;
        private int height;

        Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public boolean isBiggerThan(Person other) {
            return this.weight > other.weight && this.height > other.height;
        }
    }

    public int[] getBuildRank(List<Person> people) {

        int[] ranks = new int[N];

        for (int i = 0; i < N; i++) {
            int rank = 1;
            Person cur = people.get(i);
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                Person other = people.get(j);
                if (other.isBiggerThan(cur)) {
                    rank += 1;
                }
            }
            ranks[i] = rank;
        }
        return ranks;
    }

    public static void main(String[] args) throws IOException {

        BigBuild T = new BigBuild();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            people.add(new Person(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
        }

        for (int r : T.getBuildRank(people)) {
            System.out.print(r + " ");
        }

    }
}
