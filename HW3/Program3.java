package HW3;

import java.util.ArrayList;
import java.util.Collections;

//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class Program3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(9);
        list.add(10);
        list.add(0);
        list.add(12);
        list.add(24);

        System.out.println("Список: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);
        int result = 0;
        for (int i : list) {
            result += i;
        }
        System.out.println("Среднее значение:" + result / list.size());
        System.out.println("Среднее арифметическое значение: " + average);

    }

}
