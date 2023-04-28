package Seminar2.Task2;

public class Program {
    public static void main(String[] args) {
        String str = "aaabbbbcdd";
        System.out.println(squizStr(str));
    }


    private static String squizStr(String str){
        StringBuilder build = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)){
                count++;
            }
            else {
                if(count == 1){
                    build.append(str.charAt(i));
                }
                else {
                    build.append(str.charAt(i) + Integer.toString(count));
                    count = 1;
                }
            }
        }
        if(count == 1){
            build.append(str.substring(str.length() - 1));
            }
        else{
            build.append(str.substring(str.length() - 1) + Integer.toString(count));
        }


        return build.toString();
    }
}

//
//public class Program {
//    public static void main (String[] args) {
//        String input = "aaaabbbcdddadd";
//
//        int count = 1;
//
//        char a = input.charAt(0);
//
//        StringBuilder output = new StringBuilder();
//
//        for (int i = 1; i < input.length(); i++) {
//            if (input.charAt(i) == a) {
//                count++;
//            }
//            else {
//                if (count > 1) {
//                    output.append("" + a + count );
//                }
//                else {
//                    output.append(a);
//                }
//                count = 1;
//                a = input.charAt(i);
//            }
//        }
//        if (count > 1) {
//            output.append("" + a + count);
//        } else {
//            output.append(a);
//        }
//        System.out.println(output.toString());
//    }
//}