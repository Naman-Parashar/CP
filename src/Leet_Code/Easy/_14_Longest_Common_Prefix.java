/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/
package Leet_Code.Easy;

public class _14_Longest_Common_Prefix {

    public String longestCommonPrefix(String[] strs){
        if (strs.length==0){
            return "";
        }
        String op = strs[0];
        for (int i = 1; i <strs.length ; i++) {

            while (strs[i].indexOf(op)!=0){
                op = op.substring(0,op.length()-1);
            }

        }
        return op;
    }

    public static void main(String[] args) {
        String[] str = {"aaa","aa","aaa"};
        String op = new _14_Longest_Common_Prefix().longestCommonPrefix(str);
        System.out.println(op);
    }
}
