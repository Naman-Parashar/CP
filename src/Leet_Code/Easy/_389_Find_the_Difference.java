package Leet_Code.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _389_Find_the_Difference {
    public static char findTheDifference(String s, String t) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (int i = 0; i < t.length(); i++) {
//            if (!map.containsKey(t.charAt(i))) map.put(t.charAt(i),1);
//            else map.put(t.charAt(i),map.get(t.charAt(i))+1);
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//           if(map.containsKey(s.charAt(i))) {
//               map.put(s.charAt(i),map.get(s.charAt(i))-1);
//               if (map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
//           }
//
//        }
//        Set<Character> d = map.keySet();
//        char op =' ';
//        for (char x : d){
//            op = x;
//        }
//        return op;

        // or


//        char x = '0';
//        char[] ch = s.toCharArray();
//        char[] ch1 = t.toCharArray();
//        Arrays.sort(ch);
//        Arrays.sort(ch1);
//        for (int i = 0; i < s.length(); i++) {
//            if (ch[i] != ch1[i]) {
//                x = ch1[i];
//                return x;
//            }
//        }
//        return ch1[ch1.length-1];



        //or

        //do XOR operation 0 0 0   1 0 1
        //   0 1 1   1 1 0//

        char c=0;
        for(int i=0;i<s.length();++i){
            c^=s.charAt(i);
        }
        for(int i=0;i<t.length();++i){
            c^=t.charAt(i);
        }
        return c;

    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("hello","helloe"));
    }
}
