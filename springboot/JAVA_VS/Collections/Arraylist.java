package Collections;

import java.util.*;

public class Arraylist {
    public static void main(String a[]) {
        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.remove(2);
        System.out.println(arraylist);
        System.out.println(arraylist.get(2));
        System.out.println(arraylist.size());
        System.out.println(arraylist.isEmpty());
        System.out.println(arraylist.contains(22));

    }
}
