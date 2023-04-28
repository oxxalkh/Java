package Seminar2.Task4;

import java.util.Scanner;

import java.io.*;

/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter string: ");
        String str = iScanner.next().toString();
        System.out.println("Результат операции:");
        System.out.printf("%s",writeLine(createLine(str)));

        iScanner.close();
        
    }
    public static String createLine(String str){
        String tmp = "";
        for (int i = 0; i < 100; i++) {
            tmp +=str;
        }
        return tmp;
    }
    public static String writeLine(String tmp){
        try(FileWriter fw = new FileWriter("file.txt", false)){
            fw.write(tmp);
            String one = "Запись прошла успешно";
            return one;
        }
        catch (IOException ex){
            String message1 = "Запись прервалась";
            String message2 = message1 + ex.getMessage();
            return message2;
        }
    }
}