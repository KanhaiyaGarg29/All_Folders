package ques;
import java.util.*;
//motogp
public class q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int diff=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int ans=Math.abs(arr[i]-arr[j]);
                if(ans<diff){
                    diff=ans;
                }
            }
        }
        System.out.println(diff);
        sc.close();
    }
}
