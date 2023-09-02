package Recurssion.src.me.Tholkappiar;

public class PhNumCombinaton {
    public static void main(String[] args) {
        Number combi = new Number();
        combi.letterCombinations("","12");
    }
}
class Number {
    public void letterCombinations(String pro,String unpro) {
    if(unpro.isEmpty())
    {
        System.out.println(pro);
        return;
    }
    int digit = unpro.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
         letterCombinations(pro+ch,unpro.substring(1));
        }
    }
}