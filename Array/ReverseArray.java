package Array;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr1=new int[n];
    int[] arr2=new int[n];
    for(int  i=0;i<arr1.length;i++){
        arr1[i]=sc.nextInt();
    }
    int j=arr2.length;
    for(int i=0;i<arr1.length;i++){
        arr2[j-1]=arr1[i];
        j--;
    }
    for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
    }
    sc.close();
    }
}
