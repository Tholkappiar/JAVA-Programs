/*
Find the occurrence of SubString in the main String

Input format :
First string is the main String
Second string is the sub-string.

Output format :
Refer to the sample test cases.

Sample test cases :
Input 1 :
captainCaptaincaptain
cap

Output 1 :
Found at 0
Found at 14
 */

package String.src.me.Tholkappiar;

import java.util.*;
public class NaiveIndex{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        compare(str1,str2);
    }
    static void compare(String str1,String str2)
    {
        int flag=0;
        for(int i=0;i<=str1.length()-str2.length();i++)
        {
            if(str1.substring(i,i+str2.length()).equals(str2))
            {
                System.out.println("Found at "+ i);
                flag = 1;
            }
        }
        if(flag==0)
        {
            System.out.println("Not Found");
        }
    }
}