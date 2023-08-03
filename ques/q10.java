package ques;
import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        //perfect cube
        //27 67 64
        for(int i=0;i<n;i++){
            if(isCube(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
    static boolean isCube(int n){
        int cube=1;
        for(int i=1;i<=n;i++){
            cube=i*i*i;
            if(cube==n){
                return true;
            }
            if(cube>n){
                return false;
            }
        }
        return false;
    }
}
