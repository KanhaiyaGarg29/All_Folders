package ques;
import java.util.*;
//sum of non prime
public class q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
           int digit=num%10;
           if(isNotPrime(digit)){
            sum=sum+digit;
           }
           num=num/10;
        }
        System.out.println(sum);
        sc.close();
    }
    static boolean isNotPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }
}
