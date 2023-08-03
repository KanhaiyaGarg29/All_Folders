package Recursion;

public class FirstKmultiples {
    public static void main(String[] args) {
        printMultiples(5, 4);
    }
    static void printMultiples(int n,int k){
        if(k==1){
            System.out.print(n);
            return;
        }
        printMultiples(n, k-1);
        System.out.print(n*k);
    }
}
