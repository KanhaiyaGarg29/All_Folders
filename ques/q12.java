package ques;
import java.util.*;
public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        if(arr[0]>=arr[1]) System.out.println(0);
        if(arr[n-2]<=arr[n-1]) System.out.println( arr[n-1]);
        for(int i=1;i<n-1;i++){
             if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                System.out.println(arr[i]);
            }
        }
        // System.out.println(highest);
        sc.close();
    }
}//doubt
