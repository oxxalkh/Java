package Seminar1.Task1;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите имя: ");
        String name = scan.nextLine();
        System.out.printf("Привет: %s \n", name);
        scan.close();
    }
}
