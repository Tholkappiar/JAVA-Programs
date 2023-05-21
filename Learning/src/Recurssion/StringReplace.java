package Recurssion;

public class StringReplace {
    public static void main(String[] args) {
        System.out.println(ReplaceWord("socalledappleii"));
    }
    static void change(String str1,String str2)
    {
        if(str1.isEmpty())
        {
            System.out.println(str2);
            return;
        }
        char temp = str1.charAt(0);
        if(temp=='a')
        {
            change(str1.substring(1),str2);
        }
        else {
            change(str1.substring(1),str2+temp);
        }
    }

    //with return type
    static String ReturnChange(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        char ch = str.charAt(0);
        if(ch=='a')
        {
            return ReturnChange(str.substring(1));
        }
        else {
            return ch + ReturnChange(str.substring(1));
        }
    }

    //word Replace with ""

    static String ReplaceWord(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }

        if(str.startsWith("apple"))
        {
            return ReplaceWord(str.substring(5));
        }
        else {
            return str.charAt(0) + ReplaceWord(str.substring(1));
        }
    }
}
