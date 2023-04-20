package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissing {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        missing1 m = new missing1();
        System.out.println(m.dis(nums));
    }
}
class missing1 {
    public List<Integer> dis(int[] nums) {


        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i] - 1;
            if( nums[i] != nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
            if(j!=nums[j]-1)
            {
                list.add(j+1);
            }
        }
        return list;


    }
}
