package string;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("YEs");
        }
        else{
            System.out.println("No");
        }
    }
}
