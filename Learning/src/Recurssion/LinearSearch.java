package Recurssion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        System.out.println(search(arr,0,target));
    }
    static boolean search(int[] arr,int index,int target)
    {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || search(arr,index+1,target);
    }
}
