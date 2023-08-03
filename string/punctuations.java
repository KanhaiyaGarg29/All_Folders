package string;
import java.util.*;
public class punctuations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
