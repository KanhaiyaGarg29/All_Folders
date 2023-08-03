package Array;
import java.util.*;
public class JaggedArray1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int r=sc.nextInt();
        int[][] arr=new int[r][];
        System.out.println("Enter columns for each row");
        for(int c=0;c<r;c++){
            arr[c]=new int[sc.nextInt()];
        }
        System.out.println("Enter array elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array elements are");
        for(int i=0;i<r;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}