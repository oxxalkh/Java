package Seminar1.Task2;
/*Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1. */

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int arr[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");/*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]); // Выводим на экран, полученный массив
        }
        System.out.println();


        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }


        System.out.println(max);
    }
}