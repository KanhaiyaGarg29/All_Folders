package RecursionStrings;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        char[] arr=s.toCharArray();
        System.out.println(Arrays.toString(arr));
        for(char c:arr){
            if(ans.indexOf(c)==-1){
                ans=ans+c;
            }
        }
        System.out.println(ans);
            sc.close();
        }
    }
        // int index=0;
        // for(int i=0;i<n;i++){
        //     int j;
        //     for(j=0;j<i;j++){
        //         if(arr[i]==arr[j]){
        //             break;
        //         }
        //     }
        //     if(j==i){
        //         arr[index]=arr[i];
        //         index++;
        //     }
        // }
        // for(int i=0;i<index;i++){
        //     System.out.print(arr[i]);
        // }


    //    for(int i=0;i<s.length();i++){
    //     char c=s.charAt(i);
    //     if(ans.indexOf(c)==-1){
    //         ans=ans+c;
    //     }
    //    }
    //     System.out.println(ans);  




  // char[] temp=new char[n];
        // int j=0;
        // for(int i=0;i<n-1;i++){
        //     if(arr[i]!=arr[i+1]){
        //        temp[j]=arr[i];
        //        j++;
        //     }
        // }
        // temp[j++]=arr[n-1];
        // System.out.println(Arrays.toString(temp));
        // System.out.println(new String(temp));

        // int j=0;
        // for(int i=0;i<n-1;i++){
        //     if(arr[i]!=arr[i+1]){
        //         arr[j]=arr[i];
        //         j++;
        //     }
        // }
        // arr[j++]=arr[n-1];
        // for(int i=0;i<j;i++){
        //     System.out.print(arr[i]);
        // }
