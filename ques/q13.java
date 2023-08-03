package ques;
import java.util.*;
public class q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=-1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
