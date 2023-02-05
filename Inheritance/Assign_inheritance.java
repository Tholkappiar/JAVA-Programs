/* 
Write a program by creating a class Bicycle as a base class with a number of gears and speed of bicycle as 
integer attributes and create a class called MountainBike, a derived class that extends Bicycle class 
with an attribute seat height as an integer. Create a Test class to run the program and obtain the output in 
the console.
Input Format: 
To get 3 integers from the user (Number of gears, Speed of bicycle, and Seat height).
*/
import java.util.*;
class oper
{
    void thols(int a,int b,int c)
    {
        int gear=a;
        int bicyle=b;
        int seat=c;
    }
}
class print extends oper
{
    void get(int gear,int bicycle,int seat)
    {
        System.out.println("No of gears are "+gear);
        System.out.println("speed of bicycle is "+bicycle);
        System.out.println("seat height is "+seat);
    }
}
class assign_inheritance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        print p=new print();
        p.get(a,b,c);
    }
}
