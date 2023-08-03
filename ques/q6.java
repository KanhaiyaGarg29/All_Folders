package ques;
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        Arrays.sort(arr);
       
        for(int i=arr.length-1;i>=0;i--){
            int left=0;
            int right=arr.length-1;
        while(left<right){
          if(arr[left]+arr[right]==arr[i]){
            count++;
            left++;
            right--;
          }
          else if(arr[left]+arr[right]<arr[i]){
            left++;
          }
          else{
            right--;
          }
        }
    }
    System.out.println(count);
    sc.close();
    }
}
//i-1