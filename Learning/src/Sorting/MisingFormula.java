package Sorting;

/////only works when an array starts with 0 and ends with n , without having repetition of numbers //////
public class MisingFormula {
        public static void main(String args[])
        {
            int[] nums = {0,1,2,3,5,6};


            int n = nums.length;
            int sum = n*(n+1)/2;
            int sum2 = 0;
            for (int each:nums){
                sum2+=each;
            }
            System.out.println(sum-sum2);


        }
}
