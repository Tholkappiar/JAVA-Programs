package Sorting.src.me.Tholkappiar;

import java.util.Arrays;

class SelectionSort{
    public static void main(String[] args) {

        int[] arr ={5,4,3,2,1};
        sort(arr);
    }

    //finding the smallest element with swap with i

    public static void sort(int[] arr)
    {

        for(int i=0;i<arr.length;i++) {
            int min =i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]=temp;
        }

        System.out.println(Arrays.toString(arr));

    }

}