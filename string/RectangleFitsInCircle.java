package string;
import java.util.*;
public class RectangleFitsInCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        int r=sc.nextInt();
        if(2*r>=Math.sqrt(w*w+h*h)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
