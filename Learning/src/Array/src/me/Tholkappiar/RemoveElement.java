package Array.src.me.Tholkappiar;
/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
The remaining elements of nums are not important as well as the size of nums.
Return k.

Link : -> https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = {3,3};
        int val = 5;
        System.out.println(s.removeElement(nums,val));
       // System.out.println(Arrays.toString(nums));
    }
}
class Solution1 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i; j++) {
                if(nums[j]==val)
                {
                    swap(nums,j,j+1);
                }
            }
        }

        //to find the val index in nums
        for (int i = 0; i < nums.length; i++) {
            if(nums.length==1 && nums[i]!=val)
            {
                return 1;
            }
            if(nums[i]==val)
            {
                return i;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums,int left,int right)
    {
        if(left< nums.length&&right<nums.length)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }

    }
}