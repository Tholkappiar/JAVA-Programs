/*
Write a program to move all the uppercase characters to the end of the string.

Note: Create an interface with a method and the main class should define the interface method.

Input format
Input to get a string.

Output format
Display the output as shown in the sample output.

Sample testcases
Input 1             Output 1
REasonBehInd        asonehndREBI

*/
// You are using Java
import java.util.*;
interface oper
{
    void print(String str);
}
class prints implements oper
{
    public void print(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if((int)ch[i]>=97 && (int)ch[i]<=122)
            {
               System.out.print(ch[i]);
            }
        }
        
        for(int i=0;i<str.length();i++)
        {
            if((int)ch[i]>=65 && (int)ch[i]<=90)
            {
                System.out.print(ch[i]);
            }
            
        }
    }
}
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        prints p=new prints();
        p.print(str);
    }
}