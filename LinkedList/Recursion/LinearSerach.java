package Recursion;

import java.util.ArrayList;

public class LinearSerach {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 6, 3, 8 };
        System.out.println(linearsearch(arr, 3, 0));
        // findAllIndex(arr, 3, 0);
        // System.out.println(list);
        System.out.println(findAllIndex(arr, 3, 0, list));
    }

    static boolean linearsearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        if (arr[index] == target) {
            return true;
        }
        return linearsearch(arr, target, index + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1,list);

    }

    // static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
    //     ArrayList<Integer> list=new ArrayList<>();
    //     if (index == arr.length) {
    //         return list;
    //     }
    //     if (arr[index] == target) {
    //         list.add(index);
    //     }
    //    ArrayList<Integer> ansFromBelowCalls= findAllIndex2(arr,target, index+1);
    //   list.addAll(ansFromBelowCalls);
    //   return list;
    // }
//dont use this approach
}
