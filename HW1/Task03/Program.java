package HW1.Task03;
/*Реализовать простой калькулятор */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try{
            Scanner iScanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = iScanner.nextInt();
            System.out.println("Введите оператор(+,-,/,=,p(для возведения в степень)): ");
            char operation;
            operation = iScanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            int b = iScanner.nextInt();
            iScanner.close();
            double result = 0;
            switch (operation) {
                case '/':
                    try {
                        result = a / b;
                    } catch (ArithmeticException e) {
                        System.out.println("Делить на ноль нельзя!");
                    }
                    break;
                case '*':
                    result = a * b;
                    System.out.println(result);
                    break;
                case '-':
                    result = a - b;
                    System.out.println(result);
                    break;
                case '+':
                    result = a + b;
                    System.out.println(result);
                    break;
                case 'p':
                    result = Math.pow(a, b);
                    System.out.println(result);
                    break;
            }
        }
        catch(InputMismatchException e){
            System.out.println("Неверный оператор/число. Повторите ввод");

        }

    }

}