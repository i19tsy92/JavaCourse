package ru.rookonroad.basics.task;

/**
 * Без использования библиотечных классов реализовать два метода (удобнее сначала реализовать isPrime, а потом использовать его в searchPrimeNums
 * Простое число - это число, которое делиться только на самого себя и на единицу: например 5, 7, 11, 13, 17, 23 и т д
 */
public class PrimeNumber {


    public int[] searchPrimeNums() {
        int[] result = new int[10];
        //TODO Найти все простые числа в промежутке от 2 до 100
        //% - оператор который поможет в поиске простых чисел (возвращает остаток от деления числа на число)
        // если массива не хватит, его можно инициализировать большего объема
        return result;
    }

    public boolean isPrime(int num) {
        boolean result = false;
        // TODO Определить простое число num или нет
        return result;
    }
}
