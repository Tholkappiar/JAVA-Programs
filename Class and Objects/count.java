/*In this program, we will read a positive integer number and
 then calculate the count of all digits using a class. */




 import java.util.*;
 class main{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         oper o = new oper(n);   
         
     }
 }
 class oper
 {
     oper(int n)
     {
         int count=0;
         int k;
         while(n!=0)
         {
             k=n%10;
             count++;
             n/=10;
         }
         System.out.println("Count of all digits: "+count);
     }
 };