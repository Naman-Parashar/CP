/*Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?
 */
package Leet_Code.Easy;

public class _09_Palindrome_Number {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int i = 0;
        int j = str.length()-1;
        boolean flag = true;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                flag= false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
    public int[] twoSum(int[] nums, int target) {
        int arr[] ={0,0};
        for(int i =0 ;i<nums.length;i++){
            for(int j =i+1 ;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return arr;
    }
}
