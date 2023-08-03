/*
 An e-coomerce company wishes to bucketize its products.Each product has a product id.The product id is a numeric number.The company has to find the bucket id from product id.
 Calculate the smallest and largest permutation with the digits of the product id and calculate the sum of these.
 */
package ques;

import java.util.*;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = digit(num);
        int[] arr = new int[count];
        int i = 0;
        while (num > 0) {
            int digit = num % 10;
            arr[i] = digit;
            i++;
            num = num / 10;
        }
        Arrays.sort(arr);
        int n1 = 0;
        // System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            n1 = n1 * 10 + arr[j]; // form number from array
        }
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        // System.out.println(Arrays.toString(arr));
        int n2 = 0;
        for (int j = 0; j < arr.length; j++) {
            n2 = n2 * 10 + arr[j];
        }
        int sum = n1 + n2;
        System.out.println(sum);
        sc.close();

    }

    static int digit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}
