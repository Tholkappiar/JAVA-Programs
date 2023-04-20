package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        InsSort(arr);
    }
    public static void InsSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j]>arr[j-1])
                {
                    break;
                }
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int left,int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
