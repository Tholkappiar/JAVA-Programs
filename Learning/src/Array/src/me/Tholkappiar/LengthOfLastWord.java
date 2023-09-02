package Array.src.me.Tholkappiar;

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
   Link -> : https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        lasttword l = new lasttword();
        System.out.println(l.lengthOfLastWord("ate thols"));
    }
}
class lasttword {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}