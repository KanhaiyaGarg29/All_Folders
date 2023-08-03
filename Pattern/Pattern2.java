package Pattern;
import java.util.*;
public class Pattern2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        for(int i=1;i<=num;i++){
            for(int space=0;space<num-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                a++;
                System.out.print(a);
            }
            a--;
            for(int j=1;j<i;j++){
                System.out.print(a);
                a--;
            }
            System.out.println();
            a++;
        }
        sc.close();
    }
}
