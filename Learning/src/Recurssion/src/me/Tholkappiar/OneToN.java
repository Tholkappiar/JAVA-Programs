package Recurssion.src.me.Tholkappiar;

public class OneToN {
    public static void main(String[] args) {
        int n = 5;
        both(n);
    }
    static void reverse(int n)
    {
        if(n==0)
        {
            return;
        }
        reverse(n-1);
        System.out.println(n);
    }
    static void both(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}
