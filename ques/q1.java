package ques;
/*
 The lottery company has a list of n lottery ticket codes.The ticket code is a numeric value.The lottery has to shortlist the runner up prize.The shortlisting strartegy involves selecting the code whose frequency in the list is equal to its value.If there are multiple codes where frequency in the list is equal to its value select the one which has largest value.Write a java program to select the shortlisted code
 */
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        // int ans=0;
    
      //store the frequency of each number
    //     int[] freq=new int[arr.length+1];
    //     for(int i:arr){
    //         freq[i]++;
    //     }
    //     //find the code with freq equal to its value
    //    int maxfreq=0;
    //    for(int i=0;i<freq.length;i++){
    //     int frequency=freq[i];
    //     if(freq[i]==i && frequency>maxfreq){
    //         maxfreq=frequency;
    //         ans=i;
    //     }
    //    }
    //    System.out.println(ans);
        

    //2nd approach
    // Arrays.sort(arr);
    // int count=1; 
    // int ans=0;
    // for(int i=0;i<arr.length-1;i++){
    //     if(arr[i]==arr[i+1]){
    //         count++;
    //     }
    //     if(count==arr[i]){
    //         ans=count;
    //         count=1;
    //     }
    // }
    // System.out.println(ans); 

    //3rd approach
    int[] freq=new int[arr.length];
    int visited=-1;
    for(int i=0;i<arr.length;i++){
        int count=1;
       for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            count++;
            freq[j]=visited;
        }
       
       }
       if(freq[i]!=visited){
        freq[i]=count;
       }
    }
    System.out.println(Arrays.toString(freq));
    Arrays.sort(freq);
    System.out.println(Arrays.toString(freq));
    System.out.println(freq[arr.length-1]);
               
     
   sc.close();
    }
}
