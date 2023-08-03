package string;
import java.util.*;
public class OddEvemIndexed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String even="";
        String odd="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                even=even+s.charAt(i);
            }
            else{
                odd=odd+s.charAt(i);
            }
        }
        System.out.println(even+odd);
    }
}
