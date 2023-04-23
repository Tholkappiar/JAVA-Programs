/*
create an abstract class marks with the following method

void getPercentage();
Create a class A that extends marks and has 3 attributes marks1, marks2, and marks3 and a method getPercentage that calculates and prints the percentage1 of the student.
Create a class B that extends marks and has 4 attributes marks1, marks2, marks3, and marks4 and a method getPercentage that calculates and prints the percentage1 of the student.
Round off the output to two decimal places.

Input format
The first line of the input consists of three integers i.e., the marks scored by student A.
The second line of the input consists of four integers i.e., the marks scored by student B.

Output format
The first line prints the percentage1 of A.
The second line prints the percentage1 of B.

Sample testcases
Input 1         Output 1
95 85 75            85.00
85 77 92 93         86.75


*/
// You are using Java
import java.util.*;
abstract class marks
{
    abstract void getpercentage(int n1,int n2,int n3);
    abstract void getpercentage(int num1,int num2,int num3,int num4);
}
class percentage1 extends marks
{
    void getpercentage(int n1,int n2,int n3)
    {
        double a=((n1+n2+n3)/3.0);
        System.out.println(String.format("%.2f",a));
    }
    void getpercentage(int num1,int num2,int num3,int num4)
    {
        double b=((num1+num2+num3+num4)/4.0);
        System.out.println(String.format("%.2f",b));
    }
}
class percentage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        percentage1 p=new percentage1();
        p.getpercentage(n1,n2,n3);
        p.getpercentage(num1,num2,num3,num4);
    }
}