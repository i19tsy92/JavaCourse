package ru.rookonroad.basics;

import ru.rookonroad.basics.exercise.SearchExample;

/**
 * В методе main этого класса можно запускать любые примеры или задачи
 * Для генерации массива необходимо воспользоваться методом ArraysUtils.get(size), где size - необходимый размер массива
 */
public class Main {

    public static void main(String ... args) {
        SearchExample example1 = new SearchExample(100);
        System.out.println(example1.count(1));
        System.out.println(example1.search(3));
    }
}
