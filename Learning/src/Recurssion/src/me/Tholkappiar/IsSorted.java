package Recurssion.src.me.Tholkappiar;

import java.util.Arrays;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,14,5};
        System.out.println(isSort(arr,0));
    }
    static boolean isSort(int[] arr,int index)
    {
        if(index== arr.length-1)
        {
            return true;
        }
        return arr[index] < arr[index+1] && isSort(arr, index+1);
    }
}
