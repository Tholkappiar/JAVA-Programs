package Loops.src.me.Tholkappiar;

public class MinimumSquares {
    public static void main(String[] args) {
        minsqu(12);
    }
    static void minsqu(int num)
    {
            // num = 12
        int i = 0;
        int count1 = 0;
        int count2 = 0;
        int ans = 0;

        for (int j = 1; j < num; j++) {
            int total =0;
            while (i<num)
            {
                total = j + total;
                if(total==num)
                {
                    count1++;
                }
                i++;
            }
            if(count1 > count2)
                ans = count1;
            else
                ans = count2;
        }
        System.out.println(ans);

    }
}
