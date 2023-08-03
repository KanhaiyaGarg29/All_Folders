package Collections;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // List<Integer>list=new ArrayList<>();
        // List<Integer>list2=new LinkedList<>();
    //    List<Integer>vector=new Vector<>();
    //    vector.add(45);
    //    vector.add(5);
    //    vector.add(15);
    //    vector.add(56);
    //    System.out.println(vector);
    ArrayList<Integer>list=new ArrayList<Integer>();
    // ArrayList<String>list2=new ArrayList<String>();
    // ArrayList<Boolean>list3=new ArrayList<Boolean>();

    //add elements
    list.add(0);
    list.add(2);
    list.add(3);
    System.out.println(list);

    //get elements
    int element=list.get(0);
    System.out.println(element);

    //add element in between
    list.add(1, 1);
    System.out.println(list);

    //set element
    list.set(0, 5);
    System.out.println(list);

    //delete element
    list.remove(2);
    System.out.println(list);

    //size
    System.out.println(list.size());
    

    //loops
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }

    //sorting
    Collections.sort(list);
    System.out.println(list);

    //contains
   System.out.println( list.contains(50));

   //iterator
   Iterator<Integer>it=list.iterator();
   while(it.hasNext()){
    System.out.println(it.next());
   }
    }
}
