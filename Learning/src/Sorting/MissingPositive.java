package Sorting;

import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        posi p = new posi();
        System.out.println(p.firstMissingPositive(nums));
    }

}
class posi {
    public int firstMissingPositive(int[] nums) {

        int i=0;
        int correct = 0;
        while(i<nums.length)
        {
            correct = nums[i] - 1;
            if(nums[i] >0 && nums[i]<=nums.length && nums[correct]!=nums[i])
            {
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1)
            {
                return j;
            }
        }
        //System.out.println(Arrays.toString(nums));
        return 0;
    }
}