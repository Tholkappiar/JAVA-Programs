/*Write a program to find the number of occurrences of a character in a string.
Create a constructor with two parameters, pass the value from the occurences method to the constructor,
and perform the mentioned task in the constructor and display it.*/

import java.util.*;
class occurences {
    public static void Main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        char ch =sc.next().charAt(0);
        occur o =new occur(str,ch);
    }
}
class occur
{
    occur(String str, char ch)
    {
        int n=str.length();
        int count=0;
        char[] ch1=str.toCharArray();
        for(int i=0;i<n;i++)
        {
            if(ch==ch1[i])
            {
                count++;
            }
        }
        System.out.print(count);
    }
}