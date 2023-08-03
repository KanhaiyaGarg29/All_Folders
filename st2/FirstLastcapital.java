package st2;
import java.util.*;
public class FirstLastcapital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ans=sc.nextLine();
        char[] arr=ans.toCharArray();
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<ans.length();i++){
            int k=i;
            while(i<arr.length && arr[i]!=' '){
                i++;
            }
            arr[k]=(char)(arr[k]>='a' && arr[k]<='z'?((int)arr[k]-32):(int)arr[k]);
            arr[i-1]=(char)(arr[i-1]>='a' && arr[i-1]<='z'?((int)arr[i-1]-32):(int)arr[i-1]);
        }


//         char[] s=ans.toCharArray();
// s[0]= (char)(s[0]-32);
// for(int i=1;i<s.length-1;i++){
// if((s[i]==' ')){
// s[i+1]=(char)(s[i+1]-32);
// s[i-1]=(char)(s[i-1]-32);
// }
// }
// s[s.length-1]=(char)(s[s.length-1]-32);


// String[] x=str.split(” “);
// for(int i=0;i<x.length;i++)
// {
// String y=x[i];
// System.out.print(y.substring(0,1).toUpperCase()+y.substring(1,y.length()-1)+y.substring(y.length()-1,y.length()).toUpperCase());
// }
        System.out.println(new String(arr)); 
        sc.close();
    }
}
