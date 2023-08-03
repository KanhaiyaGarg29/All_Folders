package st2;
import java.util.*;
public class containsParticularch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
         if(s.indexOf(ch)==-1){
            System.out.println("No");
         }
         else{
            System.out.println("Yes");
         }
         sc.close();
    }
}
