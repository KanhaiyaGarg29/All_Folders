package Recursion;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr={13,10,33,2,5};
        System.out.println(maxArray(arr, 0));
    }
    static int maxArray(int[] arr,int index){
    //     if(index==arr.length){
         
    //         return max;
    //     }
    //     if(arr[index]>max){
    //         return maxArray(arr, index+1, arr[index]);
    //     }
    //    return maxArray(arr, index+1, max);

    if(index==arr.length-1){
        return arr[index];
    }
    int smallans=maxArray(arr, index+1);
    return Math.max(arr[index],smallans);
    }
}
