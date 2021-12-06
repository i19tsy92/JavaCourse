package ru.rookonroad.basics.exercise;

public class SearchExample {

    private int[] array;

    public SearchExample() {
        this.array = new int[100];
        for (int i = 0; i < 100; i ++) {
            array[i] = (int)(Math.random()*100);
            System.out.println(array[i]);
        }
    }

    /**
     * Проверяет наличие числа в массиве
     * @param searched - число, которое необходимо найти
     * @return true или false в зависимости от того найдено число или нет
     */
    public boolean search(int searched) {
        boolean result = false;
        for (int i = 0; i < 100; i ++) {
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
        for (int i = 0; i < 100; i++) {
            if (array[i] == searched) {
                count ++;
            }
        }
        return count;
    }
}
