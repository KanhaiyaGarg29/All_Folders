package Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,20,1};
        System.out.println(sumArray(arr,0));
    }
    static int sumArray(int[] arr,int index){
        if(index==arr.length){
            return 0;
        }
        if(index==arr.length-1){
            return arr[index];
        }
       int smallans=sumArray(arr, index+1);
       return arr[index]+smallans;
     
    }
}
