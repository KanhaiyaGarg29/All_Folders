package Recursion;

import java.util.Arrays;

public class prat {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        arr=mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr,int s,int e){
        if(arr.length==1){
            return arr;
        }
        if(s<e){
        int mid=(s+e)/2;
        int[] left=mergesort(arr,s,mid);
        int[] right=mergesort(arr, mid+1, e);

        return merge(left,right);
    }
}
    static int[] merge(int[] first,int[] second){
       int[] mix=new int[first.length+second.length];
       int i=0;
       int j=0;
       int k=0;
       while(i<first.length && j<second.length){
        if(first[i]<second[j]){
            mix[k]=first[i];
            i++;
            k++;
        }
        else{
            mix[k]=second[j];
            j++;
            k++;
        }
       
       }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
