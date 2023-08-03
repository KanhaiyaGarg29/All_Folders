package Recursion;

public class SumOfFirstN {
    public static void main(String[] args) {
        System.out.println(SumWithAlternateSigns(10));
    }
    static int SumWithAlternateSigns(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return SumWithAlternateSigns(n-1)-n;
        } 
        return SumWithAlternateSigns(n-1)+n;
    }
}
