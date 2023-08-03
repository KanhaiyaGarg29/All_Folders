package Recursion;

public class basicques3 {
    public static void main(String[] args) {
        System.out.println(sumofDigits(345));
        System.out.println(productofDigits(55));
    }
    static int sumofDigits(int n){
       if(n==0){
        return 0;
       }
       return n%10+sumofDigits(n/10);
    }
    static int productofDigits(int n){
      if(n==0){
        return 1;
      }
      return n%10*productofDigits(n/10);
    }
}
