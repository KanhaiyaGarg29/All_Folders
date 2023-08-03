package string;
import java.util.*;
public class lowertoupper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                res=res+(char)(s.charAt(i)-32);
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                res=res+(char)(s.charAt(i)+32);
            }
            else{
                res=res+" ";
            }
        }
        System.out.println(res);
    }
}
