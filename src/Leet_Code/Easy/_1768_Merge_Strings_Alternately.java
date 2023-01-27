package Leet_Code.Easy;

public class _1768_Merge_Strings_Alternately {
    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder op = new StringBuilder("");
        while (i < word1.length() || j < word2.length()){
            if(i < word1.length()) {
                    op.append(word1.charAt(i));
                    i++;
            }
            if(j < word2.length()) {
                    op.append(word2.charAt(j));
                    j++;
            }
        }
        return op.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","pqrs"));
    }
}
