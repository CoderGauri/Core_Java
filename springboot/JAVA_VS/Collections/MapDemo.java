package Collections;
import java.util.*;

import java.util.HashMap;

public class MapDemo {
    public static void main(String a[]){
        Map <Integer, String> map = new HashMap<>();
        map.put(10, "Mango");
        map.put(11, "Banana");
        map.put(12, "Orange");
        map.put(13, "Grapes");
        map.put(14, "Apple");
      Set<Integer> keys = map.keySet();
      for (int key: keys){
        System.out.println(map.get(key));

      }
      
      for(String str :   map.values()){
        System.out.println(str);
      }
    }
}
