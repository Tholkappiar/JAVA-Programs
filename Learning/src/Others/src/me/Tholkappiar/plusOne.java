package others.src.me.Tholkappiar;

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {

        int[] digits = {9};
        plus p = new plus();
        System.out.println(Arrays.toString(p.plusOne(digits)));
    }
}
class plus {
    public int[] plusOne(int[] digits) {

        int i = digits.length-1;

        while(i >= 0)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }

            i--;
        }
        int[] new_arr = new int[digits.length+1];
        new_arr[0] = 1;
        return new_arr;

    }
}