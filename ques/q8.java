package ques;
import java.util.*;
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int[] arr3=new int[m+n];
        int k=0;
        int index1=0;
        int index2=0;
        while(index1<n && index2<m){
            arr3[k]=arr1[index1];
            k++;
            index1++;
            arr3[k]=arr2[index2];
            k++;
            index2++;;
        }
        while(index1<n){
            arr3[k]=arr1[index1];
            k++;
            index1++;
        }
        while(index2<m){
            arr3[k]=arr2[index2];
            k++;
            index2++;
        }
        Arrays.sort(arr3);
        for(int i=arr3.length-1;i>=0;i--){
          System.out.print(arr3[i]+" ");
        }
   sc.close();
    }
}
