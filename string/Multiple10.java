package string;
import java.util.*;
public class Multiple10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int last=temp%10;
        int ans=0;
        if(last<5){
            ans=temp-last;
        }
        // }
        // else if(last==5) {
        //    ans=n+5;
        // }
        // else if(last==6){
        //     ans=n+4;
        // }
        // else if(last==7){
        //     ans=n+3;
        // }
        // else if(last==8){
        //     ans=n+2;
        // }
        // else if(last==9){
        //     ans=n+1;
        // }
        else if(last>=5 && last<=9){
        ans=10-last+n;
        }
System.out.println(ans);
    }
}
