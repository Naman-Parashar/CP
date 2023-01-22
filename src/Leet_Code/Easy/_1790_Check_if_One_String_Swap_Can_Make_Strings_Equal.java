package Leet_Code.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _1790_Check_if_One_String_Swap_Can_Make_Strings_Equal {
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        HashMap<Character, Character> map = new HashMap<>();
        int c = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (!map.containsKey(s1.charAt(i)) && s1.charAt(i) != s2.charAt(i)){
                map.put(s1.charAt(i), s2.charAt(i));
            }
            if (s1.charAt(i) != s2.charAt(i)) c++;
        }
        if (c != 2) {
            return false;
        } else {
            Set<Character> es = map.keySet();
            for (Character x : es) {
                if (map.get(x) != x) {
                    if (map.get(map.get(x)) != null && map.get(map.get(x)) == x) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("aa","zz"));
    }
}
