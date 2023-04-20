package String;

public class subString {
    public static void main(String[] args) {

        SubString s = new SubString();
        String haystack = "a";

        String needle =  "a";
        System.out.println(s.strStr(haystack,needle));
    }
}
class SubString {

        public int strStr(String haystack, String needle) {

            int len1 = haystack.length();
            int len2= needle.length();
            if(len2>len1)
            {
                return -1;
            }
            for (int i = 0; i <= haystack.length()-needle.length(); i++) {

                if(needle.equals(haystack.substring(i,i+len2)))
                {
                    return i;
                }

            }
                return -1;
        }
}