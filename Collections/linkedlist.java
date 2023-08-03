package Collections;
import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        // Queue<Integer>queue=new LinkedList<>();
        // //add
        // queue.offer(12);
        // queue.offer(24);
        // queue.offer(36);

        // System.out.println(queue);
        // //delete
        // System.out.println(queue.poll());

        // System.out.println(queue);

        // System.out.println(queue.peek());

        //priority queue
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        //uses min heap by default
        pq.offer(40);
        pq.offer(12);
        pq.offer(36);
        pq.offer(24);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
        PriorityQueue<Integer>pq1=new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(40);
        pq1.offer(12);
        pq1.offer(36);
        pq1.offer(24);
        System.out.println(pq1);
        pq1.poll();
        System.out.println(pq1);
        System.out.println(pq1.peek());
    }
}
