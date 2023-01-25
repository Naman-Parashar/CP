package Leet_Code.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _1309_Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static String freqAlphabets(String s) {
        char q = 'a';
        HashMap<Integer,Character> map = new HashMap<>();
        for (int i = 0; i <26 ; i++) {
            char o = (char) (q+i);
            map.put(i+1,o);
        }
        String op = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i) == '#'){
                int key = Integer.parseInt(s.substring(i-2,i));
                char o = map.get(key);
                op = o+op;
                i-=2;
            }
            else {
                int key = Integer.parseInt(String.valueOf(s.charAt(i)));
                char o = map.get(key);
                op =o+op;
            }
        }
        return op;
    }
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
        int x = 4;
        Math.sqrt(x);
    }
}
