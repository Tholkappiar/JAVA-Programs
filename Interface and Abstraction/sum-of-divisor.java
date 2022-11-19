/*
Write a program to find the sum of divisors using the concept of abstract classes.
Create an abstract class "AbstractClass" which contains abstract methods getValue() and divisorSum(int n). Then write a class called Calculator which extends the abstract class.

getValue(): Method need's to get input from the user.
divisorSum(int n): Method get's "n" as parameter and returns the sum of the numbers divisor.

Eg: Divisor of number 4 is 1, 2, 4. Output is 1+2+4 = 7

Input format
The input consists of a number.

Output format
The output prints the sum of its proper divisors.

Code constraints
    0 <= n <= 9999

Sample testcases
Input 1         Output 1
4                   7

*/
import java.util.*;
abstract class Abstractclass
{
    abstract void getValue();
    abstract void divisorSum(int num);
}
class calculator extends Abstractclass
{
    void getValue()
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        divisorSum(num);
    }
    void divisorSum(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count=count+i;
            }
        }
        System.out.println(count);
    }
}
class main
{
    public static void main(String args[])
    {
        calculator c=new calculator();
        c.getValue();
        
    }
}