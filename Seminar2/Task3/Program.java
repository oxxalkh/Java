package Seminar2.Task3;
/**
 * Напишите метод, который принимает на вход строку (String)
 * и определяет является ли строка палиндромом (возвращает boolean значение).
 */

public class Program {
    public static void main(String[] args) throws Exception {
        String str = "qw ertrEwq";
        if (checkPalindrom(str)) {
            System.out.printf("Строка %s палиндром...", str);
        } else {
            System.out.printf("Строка %s не палиндром...", str);
        }

    }
    public static boolean checkPalindrom(String str){
        str = str.toLowerCase().replace(" ", "");
        boolean pol = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                pol = false;
            }
        }
        return pol;
    }

}

//    public static void main(String[] args) {
//        String input  = "aba1ba";
//        boolean poly = isPoly(input);
//        System.out.println(poly);
//
//    }
//
//    public static boolean isPoly(String value){
//        char[] charArray = value.toCharArray();
//        int length = charArray.length;
//        for (int i = 0; i < length/2; i++) {
//            if (charArray[i] != charArray[length - i - 1]){
//                return false;
//            };
//        }
//        return true;
//    }
//
//}
