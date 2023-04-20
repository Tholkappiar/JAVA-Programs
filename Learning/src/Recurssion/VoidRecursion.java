package Recurssion;

public class VoidRecursion {
    public static void main(String[] args) {
        int num = 5;
        print(num);
    }
    static void print(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.println(num);
        print(--num); //don't use num-- , it will cause stackOverflow error !
    }
}
