package st2;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;
public class nextSmallestElement {
    public static void main(String[] args) {
        int[] arr={2,1,4,3};
        ArrayList<Integer>a=new ArrayList<>();
        Stack<Integer>s=new Stack<>();
        s.push(-1);
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(s.peek()>=curr){
                s.pop();
            }
            //ans stack top
            a.add(s.peek());
            s.push(curr);
        }
        Collections.reverse(a);
        System.out.println(a);
    }
}
