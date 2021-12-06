package ru.rookonroad.basics;

import ru.rookonroad.basics.exercise.SearchExample;

public class Main {

    public static void main(String ... args) {
        SearchExample example1 = new SearchExample();
        System.out.println(example1.count(1));
        System.out.println(example1.search(3));
    }
}
