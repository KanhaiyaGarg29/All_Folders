package Collections;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        //only unique elements
    //     Set<Integer> set=new HashSet<>();
    //elements are not in order
    //     set.add(32);
    //     set.add(2);
    //     set.add(54);
    //     set.add(21);
    //     set.add(65);
    //     System.out.println(set);
    //    set.remove(54);
    //    System.out.println(set);
    //    System.out.println(set.contains(100));
    //    System.out.println(set.contains(21));
    //    System.out.println(set.isEmpty());
    //    System.out.println(set.size());
    // set.clear();
    // System.out.println(set);

    // Set<Integer>set=new LinkedHashSet<>();
    //elements are in order
    // set.add(32);
    //     set.add(2);
    //     set.add(54);
    //     set.add(21);
    //     set.add(65);
    //     System.out.println(set);
   
    
    Set<Integer> set=new TreeSet<>();
    //elements are in sorted order
     set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        System.out.println(set);
    }

}
