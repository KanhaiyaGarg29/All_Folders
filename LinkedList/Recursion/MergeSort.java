package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr ){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
       int[] mix=new int[first.length+second.length];
       int i=0;
       int j=0;
       int k=0;
       while(i<first.length && j<second.length){
        if(first[i]<second[j]){
            mix[k]=first[i];
            i++;
            k++;
        }
        else{
            mix[k]=second[j];
            j++;
            k++;
        }
       
       }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
/*
 //merge sort
#include<iostream>
using namespace std;
void merge(int *arr,int s,int e){
    int mid=(s+e)/2;

    int len1=mid-s+1;
    int len2=e-mid;

    int *first=new int[len1];
    int *second=new int[len2];

    int mainArrayIndex=s;
    for(int i=0;i<len1;i++){
        first[i]=arr[mainArrayIndex++];
    }

    int mainArrayInde=mid+1;
    for(int i=0;i<len2;i++){
        second[i]=arr[mainArrayIndex++];
    }

    int index1=0;
    int index2=0;
    mainArrayIndex=s;
    while(index1<len1 && index2<len2){
        if(first[index1]<second[index2]){
            arr[mainArrayIndex++]=first[index1++];
        }
        else{
            arr[mainArrayIndex++]=second[index2++];
        }
    }
    while(index1<len1){
        arr[mainArrayIndex++]=first[index1++];
    }
    while(index2<len2){
        arr[mainArrayIndex++]=second[index2++];
    }
    delete []first;
    delete []second;
}
void mergeSort(int *arr,int s,int e){
    if(s>=e){
        return;
    }
    int mid=(s+e)/2;

    mergeSort(arr,s,mid);

    mergeSort(arr,mid+1,e);

    merge(arr,s,e);
}
int main(){
    int arr[50],n;
      cout<<"Enter the number of elements\n";
      cin>>n;
      cout<<"Enter the elements\n";
      for(int i=0;i<n;i++){
        cin>>arr[i];
      }
      mergeSort(arr,0,n-1);
      cout<<"Sorted array is\n";
      for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
      }
}
 */