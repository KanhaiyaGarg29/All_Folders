package st2;
import java.util.*;
public class maxfrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[256];
        for(int i=0;i<s.length();i++){
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
        System.out.println(result);
        sc.close();
        // System.out.print;ln(Arrays.toString(arr));
    }
}
