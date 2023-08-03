package string;
import java.util.*;

public class Maxfreuency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[256];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
           arr[s.charAt(i)]++;
        }
        int max=-1;
        char result=' ';
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]>max){
                max=arr[s.charAt(i)];
                result=s.charAt(i);
                
            }
        }

        System.out.print(max+" "+result);

    }
}
