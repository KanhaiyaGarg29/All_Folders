package st2;
import java.util.ArrayList;
//import java.util.Stack;
//import java.util.Collections;
public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<Integer>a=new ArrayList<>();
        //Stack<Integer>s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            int max=-1;
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i]<=arr[j]){
                    max=arr[j];
                    break;
                }
                 
            }
            a.add(max);
        }
        System.out.println(a);
    }
}
