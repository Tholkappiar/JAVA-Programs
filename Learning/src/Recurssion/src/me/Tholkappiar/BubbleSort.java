package Recurssion.src.me.Tholkappiar;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(Arrays.toString(search(arr,arr.length)));
    }
    static int[] search(int[] arr,int n)
    {
        if(n==0)
        {
            return arr;
        }
        for (int i = 1; i < n; i++) {
            if(arr[i]<arr[i-1])
            {
                swap(arr,i);
            }
        }
        return search(arr,n-1);
    }
    static void swap(int[] arr,int i)
    {
        int a = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = a;
    }
}
