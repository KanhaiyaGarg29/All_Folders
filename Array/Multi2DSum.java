package Array;
import java.util.*;
public class Multi2DSum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr1=new int[row][col];
        int[][] arr2=new int[row][col];
        int[][] arr3=new int[row][col];
        System.out.println("Enter first matrix element");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second matrix element");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Final matrix is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
