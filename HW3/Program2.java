package HW3;

import java.util.ArrayList;

// 2. Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Program2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(174);
        numbers.add(7);
        numbers.add(52);
        numbers.add(13);
        numbers.add(1);
        numbers.add(1);

        System.out.println("Список: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("Список без четных чисел: " + numbers);

    }
}