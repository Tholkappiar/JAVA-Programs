package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2};


        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while(i < arr.length)
        {
            if(arr[i] != i+1)
            {
                swap(arr,i,arr[i]-1);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
