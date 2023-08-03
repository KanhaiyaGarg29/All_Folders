package string;
import java.util.*;
public class reverseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
