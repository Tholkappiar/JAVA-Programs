package Recurssion.src.me.Tholkappiar;

public class DiceThrow {
    public static void main(String[] args) {
        dice("",3);
    }
    static void dice(String un,int target)
    {
        if(target==0)
        {
            System.out.println(un);
            return;
        }
        for (int i = 1; i < 6 && i <= target; i++) {
            dice(un+i,target-i);
        }
    }
}
