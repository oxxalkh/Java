package HW2.task2;
/*Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.*/

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.util.Arrays;

public class Program {

    public static void bubbleSort(int[] arr) throws IOException {
        Logger logger = Logger.getLogger(HW2.task2.Program.class.getName());
        FileHandler fl = new FileHandler("HW2/log2.txt", true);

        fl.setEncoding("UTF-8");
        SimpleFormatter sFormat = new SimpleFormatter();
        fl.setFormatter(sFormat);
        logger.addHandler(fl);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    logger.info("Sorted array: \n" + Arrays.toString(arr));
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {

        int[] arr = new int[] { 8, 10, 4, 272, 0, 34 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}