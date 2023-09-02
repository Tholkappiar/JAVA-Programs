package String.src.me.Tholkappiar;

/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Link -> : https://leetcode.com/problems/reverse-string/
 */

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {

        int i = 0;
        int j = s.length-1;
        char temp ;
        while(i<j)
        {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(s));
    }
}
