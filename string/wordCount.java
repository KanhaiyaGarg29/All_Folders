package string;
import java.util.*;
public class wordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        System.out.print(count+" ");
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i].charAt(0));
          System.out.print((int)(arr[i].charAt(0))+" ");
        }
    }
}
