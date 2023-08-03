package st2;
import java.util.*;
public class LeftmostRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        for(char c:arr){
            if(s.indexOf(c)!=s.lastIndexOf(c)){
                System.out.println(c);
                break;
            }
        }
        System.out.println(-1);
        sc.close();
    }
}
