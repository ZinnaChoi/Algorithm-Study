package com.example.baekjoon.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortByAge {

    public static class Person implements Comparable<Person> {

        public int age;
        public String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Person p) {
            return this.age - p.age;
        }

    }

    public ArrayList<Person> sortPeople(ArrayList<Person> arr) {
        Collections.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        SortByAge T = new SortByAge();
        Scanner kb = new Scanner(System.in);
        ArrayList<Person> arr = new ArrayList<>();

        int N = kb.nextInt();
        for (int i = 0; i < N; i++) {
            arr.add(new Person(kb.nextInt(), kb.next()));
        }

        for (Person p : T.sortPeople(arr)) {
            System.out.println(p.age + " " + p.name);
        }

        kb.close();
    }

}
