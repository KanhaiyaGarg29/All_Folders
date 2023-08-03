package ques;
import java.util.*;
public class q18 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    // int[] freq=new int[10];
  
    // for(int i:arr){
    //     freq[i]++;
    // }
    // for(int i=0;i<arr.length;i++){
    //     freq[arr[i]]++;
    // }
    // System.out.println(Arrays.toString(freq));
    // sc.close();

    ArrayList<Integer> sorted=new ArrayList<>();
    for(int i:arr){
        if(!sorted.contains(i)){
            sorted.add(i);
        }
    }
    Collections.sort(sorted);
    for(int i=sorted.size()-1;i>=0;i--){
        int target=sorted.get(i);
        for(int j=0;j<n;j++){
            if(target==arr[j]){
                System.out.print(j+" ");
            }
        }
    }
    sc.close();
}
}
