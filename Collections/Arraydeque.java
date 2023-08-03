package Collections;
import java.util.*;
public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>adq=new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        System.out.println(adq);

        adq.poll();
        
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        adq.pollFirst();
        adq.pollLast();
        System.out.println(adq);
    }
}
