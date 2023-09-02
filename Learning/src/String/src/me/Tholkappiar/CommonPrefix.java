package String.src.me.Tholkappiar;

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Link -> : https://leetcode.com/problems/longest-common-prefix/
 */

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"abab","aba",""};

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        int i = 0;
        int j = 0;

        String temp = strs[0];
        while (i < strs.length)
        {
            if(temp.equals(""))
                break;
            if(strs[strs.length-1]=="")
            {
                return "";
            }
            j = 0;
            while(j < strs[i].length() && j < temp.length())
            {
                if(temp.charAt(j) != strs[i].charAt(j) )
                {
                    temp = strs[i].substring(0,j);
                    break;
                }
                if(j==strs[i].length()-1){
                    temp = temp.substring(0,j+1);
                    break;
                    }
                j++;
            }
            i++;

        }

        return temp;

    }

}
