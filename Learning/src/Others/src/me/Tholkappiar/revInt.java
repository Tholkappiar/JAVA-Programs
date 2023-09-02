package Others.src.me.Tholkappiar;

public class revInt {
    public static void main(String[] args) {
        int x=1534236469;
        rev r = new rev();
        System.out.println(r.reverse(x));
    }
}
class rev {
    public int reverse(int x) {
        long temp=0;
        long tot=0;
        boolean min = false;

        if(x<0)
        {
            min = true;
            x=x*-1;
        }
        while(x>=1)
        {
            temp=x%10;

            temp=tot*10+temp;
            tot = temp;

            x=x/10;

        }
        if(min)
        {
            if(temp>Math.pow(2,31) || temp<Math.pow(2,-31))
            {
                return 0;
            }
            else{
                return (int)temp*-1;
            }

        }

        if(temp>Math.pow(2,31) || temp<Math.pow(2,-31))
        {
            return 0;
        }
        return (int)temp;
    }

}