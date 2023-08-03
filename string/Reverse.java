package string;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");
      
        String ans="";
        for(String w:arr){
          StringBuilder sb=new StringBuilder(w);
          sb.reverse();
          ans=ans+sb.toString()+" ";


        }
        System.out.println(ans);
    }
}
