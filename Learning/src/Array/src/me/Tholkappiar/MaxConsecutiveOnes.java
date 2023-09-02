/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Link : https://leetcode.com/problems/max-consecutive-ones/
 */


package Array.src.me.Tholkappiar;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        Solution s = new Solution();
        System.out.println(s.findMaxConsecutiveOnes(nums));
    }

}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int temp =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1)
            {
                count++;
            }
            else{
                if(count>temp)
                {
                    temp = count;
                    count = 0;
                }
                else{
                    temp=temp;
                    count=0;
                }
            }
        }
        if(count>temp)
        {
            temp = count;
        }
        return temp;
    }
}