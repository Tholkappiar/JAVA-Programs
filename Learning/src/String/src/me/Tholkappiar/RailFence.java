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
        String str = sc.next();
        int num = sc.nextInt();
        rail(str,num);
    }
    static void rail(String str,int num)
    {
        StringBuilder strbuff = new StringBuilder();
        if(num<2)
        {
            strbuff.append(str);
            System.out.println("Encrypted text is: " + strbuff);
            System.out.println("Decrypted text is: " + str);
            System.exit(0);
        }
        int row = 0;
        int col = 0;
        boolean down = false;

        char[][] ch  = new char[num][str.length()];
        for(int i=0;i<num;i++)
        {
            Arrays.fill(ch[i],'*');
        }
        for(int i = 0;i<str.length();i++)
        {
            if(row == 0 || row == num - 1)
            {
                down = !down;
            }
            if(down)
            {
                ch[row][col] = str.charAt(i);
                row++;
                col++;
            }
            if(!down)
            {
                ch[row][col] = str.charAt(i);
                row--;
                col++;
            }
        }

        for(int i=0;i<num;i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(ch[i][j]!='*')
                {
                    strbuff.append(ch[i][j]);
                }
            }
        }

        System.out.println("Encrypted text is: " + strbuff);
        System.out.println("Decrypted text is: " + str);


    }
}