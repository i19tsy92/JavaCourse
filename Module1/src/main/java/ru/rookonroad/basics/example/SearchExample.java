package ru.rookonroad.basics.example;

import ru.rookonroad.basics.task.ArrayUtils;

public class SearchExample {

    private int[] array;
    private int size;

    public SearchExample(int size) {
        this.size = size;
        this.array = ArrayUtils.gen(size);
    }

    /**
     * Проверяет наличие числа в массиве
     * @param searched - число, которое необходимо найти
     * @return true или false в зависимости от того найдено число или нет
     */
    public boolean search(int searched) {
        boolean result = false;
        for (int i = 0; i < size; i ++) {
            if (array[i] == searched) {
                result = true;
            }
        }
        return result;
    }

    /**
     * Число вхождений в массиве
     * @param searched - число для поиска
     * @return количество вхождений
     */
    public int count(int searched) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == searched) {
                count ++;
            }
        }
        return count;
    }
}
