/*
Naive Algorithm
Find the occurrence of SubString in the main String.

Example
Input
captain
cap

Output
Found at index 0

Input format :
First string is the main String
Second string is the sub string.

Input 1 :
captain
cap
Output 1 :
Found at 0
 */

package String;

import java.util.*;
class NaiveAlgo{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        check(str1,str2);
    }
    static void check(String str1,String str2)
    {
        for(int i=0;i<=str1.length();i++)
        {
            if(str1.substring(i,i+str2.length()).equals(str2))
            {
                System.out.println("Found at "+i);
                System.exit(0);
            }

        }
        System.out.println("Not Found");
    }
}