/*
Write a program to read the Register Number and Mobile Number of a student. 
Create user defined exception and handle the following: 

If the Register Number does not contain exactly 9 characters in specified format(2 numbers followed by 3 characters followed by 4 numbers) or if the Mobile Number does not contain exactly 10 characters, throw an IllegalArgumentException. 
If the Mobile Number contains any character other than a digit, raise a NumberFormatException.
If the Register Number contains any character other than digits and alphabets, throw a NoSuchElementException.

If they are valid, out the message ‘valid’ else ‘Invalid’.
Input format
Register number as a string in the first line
Mobile number as a string in the second line

Output format
Valid or Invalid with exception message



Refer sample outputs for format and exact text

Sample testcases
Input 1
19ABC1001
9949596920

Output 1
Valid

Input 2
19ABC1001
99495969209

Output 2
Invalid
java.lang.IllegalArgumentException: Mobile Number does not contain exactly 10 characters

Input 3
19ABC10019
9949596920

Output 3
Invalid
java.lang.IllegalArgumentException: Register Number does not contain exactly 9 characters

Input 4
195AC1001
9949596920

Output 4
Invalid
java.util.NoSuchElementException: Registration Number cannot contain any character other than digits and 
alphabets in format specified

Input 5
19ABC1001
994C596920

Output 5
Invalid
java.lang.NumberFormatException: Mobile Number cannot contain any character other than a digit

 */

 // You are using Java
import java.util.*;
class regexExcep
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String reg1="[0-9]{2}[a-zA-Z]{3}[0-9]{4}";
        String reg2="[0-9]{10}";
        try
        {
            if(str2.length()!=10)
            {
                throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
            }
            else if(str1.length()!=9)
            {
                throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
            }
            else if(!(str2.matches(reg2)))
            {
                throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
            }
            else if(!(str1.matches(reg1)))
            {
                throw new NoSuchElementException("Registration Number cannot contain any character other than digits and alphabets in format specified");
            }
            else if((str1.matches(reg1))&&(str2.matches(reg2)))
            {
                System.out.println("Valid");
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid");
            System.out.println(e);
        }
    }
}