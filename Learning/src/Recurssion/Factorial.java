package Recurssion;

public class Factorial {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(fact(num));
        int test = 2147483647;
        System.out.println(test+1);
    }
    static int fact(int num)
    {
        if(num<=1)
        {
            return 1;
        }
        return (num*fact(num-1));
    }
}