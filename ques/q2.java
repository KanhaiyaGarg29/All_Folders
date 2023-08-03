package ques;
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[] temp=new int[n];
        for(int i=0;i<arr.length;i++){
            temp[(i+k)%n]=arr[i];
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        sc.close();
    }
}
