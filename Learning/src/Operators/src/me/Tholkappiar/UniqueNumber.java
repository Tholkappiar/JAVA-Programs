package operators.src.me.Tholkappiar;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,3,3};
        unique(nums);
    }
    static void unique(int[] nums)
    {
        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            unique = nums[i] ^ unique ;
        }
            System.out.println(unique);
    }
}
