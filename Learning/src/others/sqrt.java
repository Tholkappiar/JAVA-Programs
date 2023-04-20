package others;

public class sqrt {
    public static void main(String[] args) {

        int x = 2147483647;
        squarert s = new squarert();
        System.out.println(s.mySqrt(x));
    }
}
class squarert {
    public int mySqrt(int x) {

        int temp = 0 ;
        if(x==1)
        {
            return 1;
        }
        for(int i=0;i<x;i++)
        {
            temp = i*i;
            if(temp==x)
            {
                return i;
            }
            else if(temp > x)
            {
                return i-1;
            }
            temp = i;
        }
        return temp;
    }
}