package ques;
import java.util.*;
public class q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        // int[] thousands=new int[3];
        // int[] hundreds=new int[3];
        // int[] tens=new int[3];
        // int[] ones=new int[3];
        // int ans=number1/1000%10;
        // System.out.println(ans);
        int smallestDigitInThousands = Math.min(Math.min(number1 / 1000 % 10, number2 / 1000 % 10), number3 / 1000 % 10);
        int largestDigitInHundreds = Math.max(Math.max(number1 / 100 % 10, number2 / 100 % 10), number3 / 100 % 10);
        int smallestDigitInTens = Math.min(Math.min(number1 / 10 % 10, number2 / 10 % 10), number3 / 10 % 10);
        int largestDigitInUnits = Math.max(Math.max(number1 % 10, number2 % 10), number3 % 10);
        
        String key = smallestDigitInThousands + "" + largestDigitInHundreds + "" + smallestDigitInTens + "" + largestDigitInUnits;
        System.out.println(key);
        sc.close();
    }
}
//3521 2452 1352
//1522
