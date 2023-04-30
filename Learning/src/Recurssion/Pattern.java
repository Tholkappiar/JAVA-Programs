package Recurssion;

public class Pattern {
    public static void main(String[] args) {
        pattern(3);
    }
    static int count = 0;
    static void pattern(int num)
    {
        if(num==0)
        {
            return;
        }
        else if(count<num){
            System.out.print("* ");
            count++;
            pattern(num);
        }else {
            System.out.println();
            count=0;
            num--;
            pattern(num);
        }
    }
}
