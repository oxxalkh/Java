package HW4;

import java.util.LinkedList;
import java.util.Scanner;

    /*
      Реализовать консольное приложение, которое:
      1. Принимает от пользователя и “запоминает” строки.
      2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
      3. Если введено revert, удаляет предыдущую введенную строку из памяти.
      4. Если введено exit, завершаем программу
      Пример:
      java
      python
      c#
      print > [c#, python, java]
      revert
      print > [python, java]
      kotlin
      print > [kotlin, python, java]
      revert
      revert
      revert
      print > []
      revert > Ошибка!
      exit -> (Программа завершилась)
     */


    public class Homework {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку(print - печать; revert - удаление предыдущей строки; exit - выход)");
            LinkedList<String> list = new LinkedList<>();
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("exit")) {
                    break;
                } else if (input.equals("print")) {
                    System.out.println("Печать строк в обратном порядке:");
//                  System.out.println(list); //выводит в строку
                    for (String s : list) {
                        System.out.println(s);
                    }

/*
                  while (!list.isEmpty()) { //выводит в столбик и  удаляет
                      System.out.println(list.removeFirst());
                  }
*/

                } else if (input.equals("revert")) {
                    if (!list.isEmpty()) {
                        list.removeFirst();
                        System.out.println("Удаление последней введеной строки из памяти");
                        System.out.println(list);
                    } else {
                        System.out.println("Нет сохраненных строк");
                    }
                } else {
                    list.addFirst(input);
                }
            }
        }
    }

