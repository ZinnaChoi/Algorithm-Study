package com.example.baekjoon.silver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.example.baekjoon.silver.SortByAge.Person;

public class SortByAgeTest {

    @Test
    public void testSolution() {
        SortByAge sortByAge = new SortByAge();
        ArrayList<SortByAge.Person> people = new ArrayList<>();
        people.add(new Person(21, "Junkyu"));
        people.add(new Person(21, "Dohyun"));
        people.add(new Person(20, "Sunyoung"));

        ArrayList<SortByAge.Person> sortedPeople = sortByAge.sortPeople(people);

        assertEquals(20, sortedPeople.get(0).age);
        assertEquals("Sunyoung", sortedPeople.get(0).name);
        assertEquals(21, sortedPeople.get(1).age);
        assertEquals("Junkyu", sortedPeople.get(1).name);
        assertEquals(21, sortedPeople.get(2).age);
        assertEquals("Dohyun", sortedPeople.get(2).name);
    }
}
