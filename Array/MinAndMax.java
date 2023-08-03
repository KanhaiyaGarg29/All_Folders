package Array;
public class MinAndMax {
    public static void main(String[]args){
        int[] arr={100,52,2,92,64,4,9};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
    }
}
