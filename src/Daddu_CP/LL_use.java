package Daddu_CP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LL_use {
    public static void main(String[] args) {
       int[] candies = {2,3,5,1,3};
       int extraCandies = 3;
//        Linked_List_O<Integer> l = new Linked_List_O<>();
//        l.createLL();
//        l.print();
//        System.out.println("Size of LL = "+l.length());
//        l.addB(40);
//        l.addB(30);
//        l.addB(20);
//        l.addB(10);
//        l.print();
        List<Boolean> arr = new ArrayList<>();
        for(int  i = 0; i < candies.length ; i++){
            boolean flag = true;
            int n = candies[i]+extraCandies;
            for(int j = 0; j<candies.length; j++){
                if(candies[j] >= n && i != j) {flag = false; break;}
            }
            if (flag) arr.add(true);
            else arr.add(false);
        }
        for (boolean q : arr){
            System.out.print(q+"  ");
        }
    }
}
