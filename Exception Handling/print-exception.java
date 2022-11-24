/*
Input an integer as dividend, input another integer as divisor and print the result of division. 
If the divisor is 0, catch the resulting exception and print the message “divide by 0”

Input format
The first line of input consists of an integer that represents the dividend
The second line of input consists of an integer that represents the divisor

Output format
The output prints the result of division.
Refer to the sample input and output for formatting specifications.

Sample testcases
Input 1         Output 1
6                   2
3

Input 2         Output 2
1               java.lang.ArithmeticException: / by zero
0

*/
import java.util.*;
class thols
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        try
        {
            int div=num1/num2;
            System.out.println(div);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}