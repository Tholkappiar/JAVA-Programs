package Operators.src.me.Tholkappiar;

public class nthBit {
    public static void main(String[] args) {

        int num = 2;
        // left shift << - to move the "1" bit to 2 places (num) , so 0110 & 0100 = 2.
        System.out.println(6 & (1<<(num-1)));
        System.out.println(6&2);
    }
}
