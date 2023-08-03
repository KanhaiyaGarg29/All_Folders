package ques;
import java.util.*;
public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int s=0;
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int e=max;
        int ans=-1;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(isPossible(arr,k,mid)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        System.out.println(ans);
        sc.close();
    }
    static boolean isPossible(int[] arr,int k,int mid){
        int cowCount=1;
        int lasPos=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-lasPos>=mid){
                cowCount++;
                if(cowCount==k){
                    return true;
                }
                lasPos=arr[i];
            }
        }
        return false;
    }
}
