package Leet_Code.Easy;

public class _709_To_Lower_Case {
    public static String toLowerCase(String s) {
        String op = "";
//        for (int i = 0; i < s.length(); i++) {
//            op = op + (char)(s.charAt(i)+32);
//        }

           //or

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                op = op + (char)(s.charAt(i)+32);
            }
            else {
                op = op + s.charAt(i);
            }
        }
        return op;
    }

    public static void main(String[] args) {
        String s = "HELLO";
        String a = toLowerCase(s);
        System.out.println(a);
    }
}
