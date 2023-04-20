package String;

public class palindrome {
    public static void main(String[] args) {

        String s = "apeaepa";
        StrPalindrome p = new StrPalindrome();
        System.out.println(p.isPalindrome(s));
    }
}
class StrPalindrome {
    public boolean isPalindrome(String s) {

        s=s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        //System.out.println(s.length());

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) != s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        return true;

    }
}