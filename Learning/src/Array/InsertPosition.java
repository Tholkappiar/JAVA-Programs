/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Link : https://leetcode.com/problems/search-insert-position/
 */


package Array;

import java.util.Arrays;

public class InsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
       
        System.out.println(searchInsert(nums,target));
    }
        static int searchInsert(int[] nums, int target) {
            int start = 0;
            int end =nums.length-1;
            while(start<=end)
            {
                int mid = (start+end)/2;

                if(nums[mid]==target)
                {
                    return mid;
                }
                if(target<nums[mid])
                {
                    end = mid-1;
                }
                if(target>nums[mid])
                {
                    start = mid+1;
                }

            }
            int i =0;
            while(i<nums.length)
            {
                if(nums[i]<target)
                {
                    i++;
                }
                else {
                    return i;
                }

            }
            return nums.length;
        }

}
