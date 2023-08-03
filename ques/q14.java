/*
 Each item is labelled with unique id from 0 to n-1.The company has target sales rate say k.The company wishes to know the two items whose total sales rate is equal to the target sales rate.
 The list of sales is prepared in such a way that no more than two items sales rate will be equal to target rate.
 Write a java program to find the id of the items whose total sales value is equal to the given target value.
 */
package ques;
import java.util.*;
public class q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(i+" "+j+" ");
                }
            }
        }
        sc.close();
    }
}
