package Array;
import java.util.*;
public class ArrayL {
    public static void main(String[]args){
      //cannot add primitives add wrapper classes
      ArrayList<Integer>list=new ArrayList<>(10);
      list.add(67);
      list.add(654);
      list.add(234);
      list.add(54);

      System.out.println(list.contains(234));
      list.set(0,99);
      list.remove(2);
      System.out.println(list);

      //get item at any index
      //list.get(i) 
    }
}
