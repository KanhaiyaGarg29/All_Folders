package Pattern;
import java.util.*;

//not done
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //print half upper pattern
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }
            //print second half upper pattern
            for (int space = 1; space < i; space++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
           System.out.println();
        }

           for(int k=1;k<=n;k++){
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            for(int space=0;space<n-k;space++){
                System.out.print(" ");
            }
            for(int space=0;space<n-k;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
           }
           sc.close();
        }
  

    }

/*
 *****
 ** **
 * *
 ** **
 ***** 
 */