package Collections;
import java.util.*;

public class setdemo {
    public static void main(String a[]){
    Set<Integer> set = new HashSet<>();
    set.add(12);
    set.add(24);
     set.add(24);
    set.add(32);
    set.add(44);
    set.remove(24);
    System.out.println(set);
    System.out.println(set.size());
    System.out.println(set.isEmpty());
    for(int num :set){
        System.out.println(num);
    }

    }
}
