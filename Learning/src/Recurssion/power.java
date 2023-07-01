package Recurssion;

/*
Problem statement :
Compute a^n

Write a program to compute a^n (a power n) using recursion.

Input format :
Input consists of an integer.

 */
public class power{
    public static void main(String[] args) {

        System.out.println(pow(2,8));
    }
    static int pow(int num,int iter)
    {
        if(iter==0)
        {
            return 1;
        }
        else{
            return num * pow(num,iter-1);
        }
    }
}