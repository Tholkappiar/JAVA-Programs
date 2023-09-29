/*
Problem Statement

Rail fence Algorithm
Write a program for the String encryption and Decryption using Rail Fence Algorithm.

Input format :
First input is the string
Second integer input is the key

Output format :
Encrypted message(String)
Decrypted message(String)

Input 1 :
RailFenceAlgorithm
4

Output 1 :
Encrypted text is: RnoaecgrmiFelihlAt
Decrypted text is: RailFenceAlgorithm
 */
package String.src.me.Tholkappiar;

import java.util.*;

public class RailFence{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to Encrypt : ");
        String str = sc.next();
        System.out.println("Enter the Number for Encryption Algorithm : ");
        int num = sc.nextInt();

        System.out.println("Given Text : " + str);
        
        // For validation and printing 
        String encrypted = encrypt(str,num);
        if(encrypted.equals(""))
        	System.out.println("Enter the valid number which suits for Encryption");
        else
        System.out.print("Encrypted Text : " + encrypted );
        
    }
    private static String encrypt(String str,int num)
    {
        if(num<2 || num > str.length()-1)
        {
            return "";
        }
        int row = 0;
        int col = 0;
        boolean down = false;

        char[][] charArray  = new char[num][str.length()];
        for(int i=0;i<num;i++)
        {
            Arrays.fill(charArray[i],'*');
        }
        for(int i = 0;i<str.length();i++)
        {
            if(row == 0 || row == num - 1){
                down = !down;
            }
            if(down){
                charArray[row++][col++] = str.charAt(i);
            }else
            {
                charArray[row--][col++] = str.charAt(i);
            }
        }
        StringBuilder strBuilder = new StringBuilder();
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(charArray[i][j]!='*')
                {
                    strBuilder.append(charArray[i][j]);
                }
            }
        }

        return strBuilder.toString();
    }
}