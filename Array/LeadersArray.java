package Array;
import java.util.*;
public class LeadersArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int j;
            for( j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            //loop didn't break
            if(j==n){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
/*
 public class Main{
   public static void main(String[] args){
   
      //Declare and initialize the array elements
      int array[] = {16, 17, 4, 3, 5, 6, 9, 1, 8, 2};
      int m = array.length;
      System.out.println("Leaders in the array are: ");
      
      //call a user defined method
      findLeaders(array, m);
   }
   
   //main method
   static void findLeaders(int arr[], int size){
   
      //Logic Implementtaion
      int rightMaximum=arr[arr.length-1];
      
      //Here we have started loop from size-2 
      
      //as rightmost element is always a leader
      System.out.print(rightMaximum+" ");
      for (int i = size-2; i>=0; i--) {
         if(arr[i] > rightMaximum){
            rightMaximum=arr[i];
            System.out.print(rightMaximum+" ");
         }
      }
   }
}
 */