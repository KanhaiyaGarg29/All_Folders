package ques;
import java.util.*;
public class q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=factors(n);
        System.out.println(Arrays.toString(arr));
        int ans=arr[k-1];
        if(ans==0){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
        sc.close();
    }
    static int[] factors(int num){
        int[] arr=new int[num];
        int j=0;
        for(int i=2;i<=num;i++){
            while(num%i==0){
                arr[j]=i;
                j++;
                num=num/i;
            }
        }
        return arr;
    }
}
