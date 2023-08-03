package string;
import java.util.*;
public class ProductCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        char[] ch=new char[n];
       for(int i=0;i<n;i++){
        ch[i]=sc.next().charAt(0);
       }
        int sum=0;
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==ch[i]){
                    sum=sum+(int)(s.charAt(j));
                }
            }
        }
        System.out.println(sum);
    }
}
