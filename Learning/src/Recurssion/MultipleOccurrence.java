package Recurssion;

import java.util.ArrayList;

public class MultipleOccurrence {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,4,4,5};
        int target = 4;
        System.out.println(search(arr,target,0,new ArrayList<>()));
    }
    static ArrayList<Integer> search(int[] arr,int target,int index,ArrayList<Integer> list)
    {
        if(index == arr.length-1)
        {
            return list;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        return search(arr,target,index+1,list);
    }
}
