package HW2.task4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Program {

private static Logger logger;

public static void main(String[] args) throws Exception {
        try {
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
            Logger logger = Logger.getLogger(HW2.task4.Program.class.getName());
            FileHandler fl = new FileHandler("HW2/log4.txt", true);
            fl.setEncoding("UTF-8");
            SimpleFormatter sFormat = new SimpleFormatter();
            fl.setFormatter(sFormat);
            logger.addHandler(fl);

            switch (operation) {
                case '/':
                    try {
                        result = a/b;
                        System.out.println(result);
                        logger.info("\n Операция деления. \n");
                    } catch (ArithmeticException e) {
                        System.out.println("Делить на ноль нельзя!");
                        logger.info("\n Попытка деления на ноль. \n");
                    }
                    break;
                case '*':
                    result = a * b;
                    System.out.println(result);
                    logger.info("\n Операция умножения. \n");
                    break;
                case '-':
                    result = a - b;
                    System.out.println(result);
                    logger.info("\n Операция вычитания. \n");
                    break;
                case '+':
                    result = a + b;
                    System.out.println(result);
                    logger.info("\n Операция сложения. \n");
                    break;
                case 'p':
                    result = Math.pow(a, b);
                    System.out.println(result);
                    logger.info("\n Возведение в степень. \n");
                    break;
            }
        }
        catch(InputMismatchException e){
            System.out.println("Неверный оператор/число. Повторите ввод");
            logger.warning("\n Попытка ввода недопустимого значения числа или оператора \n");

        }

    }

}