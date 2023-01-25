package Leet_Code.Easy;

import java.util.ArrayList;

public class _1290_Convert_Binary_Number_in_a_Linked_List_to_Integer {
    public int getDecimal(ArrayList<Integer> binary){
        int decimal = 0;
        int n = 0;
        for (int i = binary.size()-1; i >= 0; i--) {
                decimal += binary.get(i)*Math.pow(2, n);
                n++;
        }
        return decimal;
    }
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null){
            arr.add(head.val);
            head = head.next;
        }
        return getDecimal(arr);
    }


    public static void main(String[] args) {
        String d = "12"+3;
        System.out.println(d.getClass().getName());
    }
}
