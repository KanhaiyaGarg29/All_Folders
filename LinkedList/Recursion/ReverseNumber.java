package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
    reverse(1824);
    System.out.println(reverse2(1824));
    System.out.println(sum);
    }
    static int sum=0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
    static int reverse2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
         if(n%10==n){
            return n;
         }
         int rem=n%10;
         return (int)(rem*Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
}
/*
 if(num<10){
    print(num);
    return;
 }
 else{
    print(n%10);
    reverse(n/10);
 }
 */
