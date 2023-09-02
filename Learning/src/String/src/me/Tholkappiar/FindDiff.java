package String.src.me.Tholkappiar;

/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding
 column number.
Link -> : https://leetcode.com/problems/excel-sheet-column-number/
 */

public class FindDiff {
    public static void main(String[] args) {
        String s = "";
        String t = "y";
        System.out.println(findTheDifference(s,t));
    }
    public static char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray())
        {
            c ^= cs;
            System.out.println('A');
        }

        for(char ct : t.toCharArray())
            c ^= ct;
        return c;
    }
}
