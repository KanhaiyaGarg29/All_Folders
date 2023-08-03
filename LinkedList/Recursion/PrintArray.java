package Recursion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr={3,4,5,7,8};
        print(arr,0);
    }
    static void print(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]);
        print(arr,index+1);
    }
}
