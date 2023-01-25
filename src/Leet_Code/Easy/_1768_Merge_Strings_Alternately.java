package Leet_Code.Easy;

public class _1768_Merge_Strings_Alternately {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        String op = "";
        while (i < word1.length() || j < word2.length()){
            if(i < word1.length()) {
                while (i < word1.length())
                {
                    op+=word1.charAt(i);
                    i++;
                }
            }
            if(j < word2.length()) {
                while (j < word2.length())
                {
                    op+=word2.charAt(j);
                    j++;
                }
            }
        }

        return op;
    }
}
