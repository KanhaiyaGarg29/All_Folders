package ques;
import java.util.*;
//Smith number

//kth prime factor
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sumofDigits=SumOfDigits(num);
        int[] arr=distinctfactors(num);
        // System.out.println(Arrays.toString(arr));
        int sumoffactors=SumOfDistinctFactors(arr);
        // System.out.println(sumoffactors);
        if(sumofDigits==sumoffactors){
            System.out.println("Smith Number");
        }
        else{
            System.out.println("Not Smith Number");
        }
        sc.close();
    }
    static int SumOfDigits(int num){
        int sum=0;
        while(num>0){
            int r=num%10;
            sum=sum+r;
            num=num/10;
        }
        return sum;
    }
    static int[] distinctfactors(int num){
        int[] arr=new int[num];
        int j=0;
        for(int i=2;i<=num;i++){
            while(num%i==0){    //if(num%i==0 && isPrime(i)){ arr[j]=i j++ }
               arr[j]=i;
               j++;
              num=num/i;
               
            }
        }
        return arr;
    }
    static int SumOfDistinctFactors(int[] arr){
        int sum=0;
         for(int i=0;i<arr.length;i++){
            sum=sum+SumOfDigits(arr[i]);
         }
         return sum;
    }
    // static boolean isPrime(int num){
    //     for(int i=2;i<num;i++){
    //         if(num%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
