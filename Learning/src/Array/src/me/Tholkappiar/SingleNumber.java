package Array.src.me.Tholkappiar;

public class SingleNumber {
    public static void main(String[] args) {

        int[] nums = {2,2,1};
        single s = new single();
        System.out.println(s.singleNumber(nums));
    }
}
class single {
    public int singleNumber(int[] nums) {

        boolean[] temp =new boolean[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i] == nums[j] && i!=j)
                {
                    temp[i] = true;
                    break;
                }
            }
        }
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i] == false)
            {
                return nums[i];
            }
        }
        return 0;

    }
}