package Collections;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        Map<String,Integer>numbers=new HashMap<>();
        //keys unique
        //store key value pair
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        System.out.println(numbers);
        numbers.putIfAbsent("Two", 23);
    //  for( Map.Entry<String,Integer> e:numbers.entrySet()){
    //     System.out.println(e);
    //     System.out.println(e.getKey());
    //     System.out.println(e.getValue());
    //  }
    //  for(String key:numbers.keySet()){
    //     System.out.println(key);
    //  }
    //  for(Integer value:numbers.values()){
    //     System.out.println(value);
    //  }

    //containsKey()
    System.out.println(numbers.containsValue(3));
    System.out.println(numbers.isEmpty());
    //clear()
    }
}
