package Recurssion.src.me.Tholkappiar;
/*
Problem statement :
Number of digits
Write a program to find the number of digits in a number using recursion.
Input format :
Input consists of a non-negative integer.
 */
public class NoOfNums {
    public static void main(String[] args) {
        System.out.println(StrRev("computer"));
    }
    static int count = 0;
    static int count(int num)
    {
        if(num==0)
            return 0;
        else
            return 1 + count(num/10);
    }
    static int sum(int num)
    {
        if(num<10)
            return num;
        else
            return num%10 + sum(num/10);
    }
    static String StrRev(String str) {
        if (str.isEmpty())
            return "";
        return StrRev(str.substring(1)) + str.charAt(0);
    }
}
