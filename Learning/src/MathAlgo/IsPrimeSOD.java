package MathAlgo;

import java.util.ArrayList;
import java.util.HashSet;

public class IsPrimeSOD {
    public static void main(String[] args) {

        prime(10);
    }
    static void prime(int num)
    {
        int num1 = num;
        ArrayList<Integer> prime = new ArrayList<Integer>();
        while (num % 2 == 0) {
            prime.add(2);
            num = num / 2;
        }
        for (int i = 3; i <= Math.sqrt(num) ; i=i+2) {
            while(num%i==0)
            {
                prime.add(i);
                num = num / i;
            }
        }
        if (num > 2) {
            prime.add(num);
        }

        for (int pri:
             prime) {
            System.out.println(pri);
        }
        
        primesod(prime,num1);
    }
    static void primesod(ArrayList<Integer> prime,int num)
    {

        HashSet<Integer> set = new HashSet<>();
        for (int i:
             prime) {
            set.add(i);
        }
        int primesum = 0;
        int numsum = 0;

        for (int i:
             prime) {
            primesum = primesum + i;
        }

        while(num > 0)
        {
            int temp = num%10;
            numsum  = numsum + temp;
            num = num/10;
        }

        if(numsum == primesum)
        {
            System.out.println("primesod");
        }
        else
            System.out.println("not a prime sod ");

        for (int i:
             set) {
            System.out.print(i + " ");
        }
    }
}
