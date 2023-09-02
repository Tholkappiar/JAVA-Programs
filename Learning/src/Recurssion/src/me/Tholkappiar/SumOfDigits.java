package Recurssion.src.me.Tholkappiar;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(sum(num));
    }
    static int sum(int num)
    {
        int temp = num % 10;
        num = num/10;
        if(temp==0)
        {
            return 0;
        }

        return temp+sum(num);



    }
}
