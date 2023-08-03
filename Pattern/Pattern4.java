package Pattern;
import java.util.*;
public class Pattern4 {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=n;i>=1;i--){
        for(int j=n;j>=1;j--){
            System.out.print(Math.max(i,j));
        }
        for(int j=2;j<=n;j++){
            System.out.print(Math.max(i,j));
        }
        System.out.println();
       }
       for(int i=2;i<=n;i++){
        for(int j=n;j>=1;j--){
            System.out.print(Math.max(i,j));
        }
        for(int j=2;j<=n;j++){
            System.out.print(Math.max(i,j));
        }
        System.out.println();
       }
       sc.close();
    }
}
//   5 5 5 5 5 5 5 5 5
//   5 4 4 4 4 4 4 4 5   
//   5 4 3 3 3 3 3 4 5          
//   5 4 3 2 2 2 3 4 5
//   5 4 3 2 1 2 3 4 5
//   5 4 3 2 2 2 3 4 5
//   5 4 4 4 4 4 4 4 5    
//   5 5 5 5 5 5 5 5 5           
