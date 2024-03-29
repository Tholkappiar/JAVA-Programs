package String.src.me.Tholkappiar;
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the
characters without disturbing the relative positions of the remaining characters.
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Link -> : https://leetcode.com/problems/is-subsequence/
 */
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        Subsequence subsequence = new Subsequence();
        System.out.println(subsequence.isSubsequence(s,t));
    }
}
class Subsequence {
    public boolean isSubsequence(String s, String t) {
        int si=0;
        if(s.length()<1)
            return true;
        for(int i=0;i<t.length();i++){
            if(s.charAt(si)==t.charAt(i))
                si++;

            if(si==s.length())
                return true;
        }
        return false;
    }
}