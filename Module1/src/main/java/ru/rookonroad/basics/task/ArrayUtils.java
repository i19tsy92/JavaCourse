package ru.rookonroad.basics.task;

/**
 * Вспомогательный класс для генерации массиов int
 */
public class ArrayUtils {


    public static int[] gen(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
