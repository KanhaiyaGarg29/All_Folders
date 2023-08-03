package st2;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str=sc.nextLine();
        if(s.length()==str.length()){
        char[] c=s.toCharArray();
        char[] a=str.toCharArray();
        Arrays.sort(c);
        Arrays.sort(a);
        if(Arrays.equals(a,c)){
            System.out.println("The strings are anagram");
        }
        else{
            System.out.println("The strings are not anagrams");
        }
      
    }
    else{
        System.out.println("The strings are not anagrams");
    }
    sc.close();
}
}
