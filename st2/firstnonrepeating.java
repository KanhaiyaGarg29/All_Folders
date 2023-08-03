package st2;
import java.util.*;
public class firstnonrepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // char[] arr=s.toCharArray();
        // for(char c:arr){
        //     if(s.indexOf(c)==s.lastIndexOf(c)){
        //      System.out.println(c);
        //      break;
        //     }
        // }
        int index=0;
      int[] arr=new int[256];
      for(int i=0;i<s.length();i++){
        arr[s.charAt(i)]++;
      }
       for(int i=0;i<s.length();i++){
        if(arr[s.charAt(i)]==1){
            index=i;
            break;
        }
       }
       System.out.println(s.charAt(index));
       sc.close();
        }
    }

