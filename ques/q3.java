package ques;
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double a1=n1-((int)n1);
        double a2=n2-((int)n2);
        // System.out.println(a1);
        // System.out.println(a2);
        if(a2-a1==0.0){//a2==a1
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
