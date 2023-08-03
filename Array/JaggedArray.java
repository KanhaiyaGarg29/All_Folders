package Array;
public class JaggedArray {
    public static void main(String[] args) {
        // int[][] arr=new int[3][];
        // arr[0]=new int[3];
        // arr[1]=new int[4];
        // arr[2]=new int[5];
        int arr[][]={{1,2,3},{4,5},{6,7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}