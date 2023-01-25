package Leet_Code.Easy;

import java.util.HashMap;

public class _953_Verifying_an_Alien_Dictionary {
    public static boolean isAlienSorted(String[] words, String order) {
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i),i);
        }
        boolean op = true;
        int flag = -1;
        for (int i = 0; i < words.length-1; i++) {
            String s1 = words[i];
            String s2 = words[i+1];
            int j = 0, k =0;
            while (j < s1.length() && k < s2.length()){
                if (s1.charAt(j) == s2.charAt(k)) {
                        k++;
                        j++;
                }
                else {
                    flag = 0;
                    if (map.get(s1.charAt(j)) < map.get(s2.charAt(k))) {
                        break;
                    }
                    if (map.get(s1.charAt(j)) > map.get(s2.charAt(k))){
                        op = false;
                        break;
                    }
                    k++;
                    j++;
                }
            }
            if (!op) break;
            if(flag == -1 && words[i+1].length() < words[i].length()){
                return false;
            }
        }
        return op;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"apple","app"};
        String order = "worldabcefghijkmnpqstuvxyz";
        System.out.println(isAlienSorted(words,order));
    }
}
