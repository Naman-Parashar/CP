package Leet_Code.Easy;

import java.util.HashMap;

public class _205_Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> m1 = new HashMap<>();
        HashMap<Character,Character> m2 = new HashMap<>();
        boolean result = true;
        for (int i = 0 ; i< s.length(); i++){
            if (!m1.containsKey(s.charAt(i)))m1.put(s.charAt(i),t.charAt(i));
            if(!m2.containsKey(t.charAt(i))) m2.put(t.charAt(i),s.charAt(i));
            if (t.charAt(i) != m1.get(s.charAt(i)) || s.charAt(i) != m2.get(t.charAt(i))) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
       Boolean ans = new _205_Isomorphic_Strings().isIsomorphic(s,t);
        System.out.println(ans);
    }
}
