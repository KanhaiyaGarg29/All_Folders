package st2;
import java.util.*;
public class CompanyTag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        int len=s.length();
        for(int i=0;i<len-1;i+=2){
            if(s.charAt(i)>s.charAt(i+1)){
                sb.append(s.charAt(i));
            }else{
                sb.append(s.charAt(i+1));
            }
        }
        if(len%2==1){
            sb.append(s.charAt(len-1));
        }

        System.out.println(sb);
        sc.close();
    }
    // public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        
        // char[] arr=s.toCharArray();
        // String ans="";
        // System.out.println(Arrays.toString(arr));
        
        // for(int i=0;i<arr.length-1;i=i+2){
        //    
        //        if(arr[i]>arr[i+1]){
                // System.out.print(arr[i]);
            //  
            //    }
            //    else{
                // System.out.print(arr[i+1]);
//              
//                }      
//         }
//     if(arr.length%2==1){      
//         System.out.println(arr[arr.length-1]);
}
//     }
// }
// }
