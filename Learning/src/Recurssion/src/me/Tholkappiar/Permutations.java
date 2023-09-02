package Recurssion.src.me.Tholkappiar;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        //permutation("","abc");
        //System.out.println(listper("","abc"));
        System.out.println(percount("","abcd"));
    }
    static void permutation(String pro,String unpro)
    {
        if(unpro.isEmpty())
        {
            System.out.println(pro);
            return;
        }
        char ch = unpro.charAt(0);

        for (int i = 0; i <= pro.length(); i++) {
            permutation(pro.substring(0,i)+ch+pro.substring(i,pro.length()),unpro.substring(1));
        }
    }
    static ArrayList<String> listper(String pro, String unpro)
    {
        ArrayList<String> list = new ArrayList<>();
        if(unpro.isEmpty())
        {
            list.add(pro);
            return list;
        }
        char ch = unpro.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= pro.length(); i++) {
            ans.addAll(listper(pro.substring(0,i)+ch+pro.substring(i,pro.length()),unpro.substring(1)));
        }
        return ans;
    }
    static int percount(String pro,String unpro)
    {
        if(unpro.isEmpty())
        {
            return 1;
        }
        char ch = unpro.charAt(0);
        int count = 0;
        for (int i = 0; i <= pro.length(); i++) {
           count = count + percount(pro.substring(0,i)+ch+pro.substring(i,pro.length()),unpro.substring(1));
        }
        return count;
    }
}
