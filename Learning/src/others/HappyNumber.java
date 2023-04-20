package others;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        Happy h = new Happy();
        System.out.println(h.isHappy(n));
    }
}
class Happy {
    public boolean isHappy(int n) {

        int last = 0;
        if(n>0)
        {
            do
            {
                if(n==0)
                {
                    n = last;
                    last = 0 ;
                }

                int temp = n % 10;
                n = n / 10;
                double ans = Math.pow(temp,2);
                last = (int)ans + last;
                if(last == 1)
                {
                    return true;
                }
            }while (last > 1 && n==0);
        }

        return false;
    }
}