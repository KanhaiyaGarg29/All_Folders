package Pattern;
import java.util.*;
public class Pattern13 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==n){
                    continue;
                }
                System.out.print(j);
            }
            for(int space=0;space<n-i;space++){
                System.out.print(" ");
            }
            for(int space=0;space<n-i-1;space++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}
