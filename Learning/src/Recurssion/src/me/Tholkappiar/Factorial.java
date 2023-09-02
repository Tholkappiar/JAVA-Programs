package Recurssion.src.me.Tholkappiar;

public class Factorial {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(fact(num));
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
