package HW1.Task02;
/*Вывести все простые числа от 1 до 1000 */
public class Program {
    public static void main(String[] args) {
        int m = 1000;
        for (int i = 2; i <= m; i++) {
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.print(i + "  ");
        }
    }
}