/*
Create an abstract class Shape with the following methods

abstract void rectangleArea();
abstract void squareArea();
abstract void circleArea();

Create a class Area that extends Shape that calculates and prints all the area.
Create a Main class, get the inputs and pass it to the methods.

Input format
The first line of the input consists of the length and breadth.
The second line consists of the side.
The third line consists of the radius.

Output format
The output prints the area of rectangle, square, and circle.
Refer sample input and output for formatting specifications.
Round off the area of the circle to two decimal places.

Sample testcases
Input 1             Output 1
10 20                200
4                    16
5                    78.54

*/
import java.util.Scanner;
abstract class Shape{
     abstract void rectangleArea(int x,int y);
     abstract void squareArea(int z);
     abstract void circleArea(double m);
}
class Area extends Shape{
      void rectangleArea(int x,int y){
      System.out.println(x*y);
          
      }
      void squareArea(int z){
          System.out.println(z*z);
      }
      void circleArea(double m){
          double k=3.14159*m*m;
          System.out.println(String.format("%.02f",k));
      }
    
} 
class area1 {
    public static void main(String arfs[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        double n3=sc.nextDouble();
        Area A=new Area();
        A.rectangleArea(n,n1);
        A.squareArea(n2);
        A.circleArea(n3);
    }
}