package Recurssion;

public class subsequence {
    public static void main(String[] args) {
        String str = "abc";
        //System.out.println(str.substring(2));
        subsets("",str);
    }
    static void subsets(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsets(p+ch,up.substring(1));
        subsets(p,up.substring(1));
    }
}