package string;
import java.util.*;
public class SortingNames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc1.nextLine();
        }
        Arrays.sort(arr);
        // String temp;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i].compareTo(arr[j])>0){
        //             temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
