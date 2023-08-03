package RecursionStrings;

public class SumOFSubset {
    public static void main(String[] args) {
        int [] arr={2,4,5};
        sumSubset(arr, arr.length, 0, 0);
    }
    static void sumSubset(int[] a,int n,int idx,int currSubSum){
        if(idx>=n){
            System.out.println(currSubSum);
            return;
        }
        //curr idx+sum
        sumSubset(a, n, idx+1, currSubSum+a[idx]); //include


        //sum
        sumSubset(a, n, idx+1, currSubSum);//exclude
    }
}
