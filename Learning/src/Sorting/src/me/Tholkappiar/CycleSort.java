package Sorting.src.me.Tholkappiar;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};


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
