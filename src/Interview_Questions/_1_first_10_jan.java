package Interview_Questions;

import java.util.*;

public class _1_first_10_jan {

    public static void main(String[] args) {
//        HashMap
        HashMap<Integer,String> map = new HashMap<Integer,String>();
//        map.put(key[Integer] , value[String]);
        map.put(1,"Naman");
        map.put(2,"sangam");
        map.put(3,"Tinu");
        map.put(4,"Bhalu");
        map.put(5,"Shivansh");

//        iterator
        for (Map.Entry x : map.entrySet()){
            System.out.println("Map 1 value: "+x.getKey() +"   "+x.getValue());
        }
//         size of hashmap
        System.out.println("size of hashmap: "+map.size());
        System.out.println("............................................");
//        copy one map to another map
        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(6,"ponia");
        map2.put(7,"Deepak");
        for (Map.Entry x : map2.entrySet()){
            System.out.println("Map 2 value :"+x.getKey() +"   "+x.getValue());
        }
        System.out.println("............................................");
//        copy all the value of map to map2.
        map2.putAll(map);

        for (Map.Entry x : map2.entrySet()){
            System.out.println("Map 2 value after copy :"+x.getKey() +"   "+x.getValue());
        }

//        map.clear(); // to clear map.

        // check that map contains a key or not.
        boolean result = map.isEmpty();
        System.out.println("is Map empty:"+result);
        map.clear(); // to clear map.
        result = map.isEmpty();
        System.out.println("is Map empty:"+result);


    }
}
