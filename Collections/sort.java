/*
Input a positive integer N (N > 0), input N strings, and sort the strings in place in the order of increasing length.
 Print the sorted strings using ArrayList as an implementation of the List interface for storing the individual 
 strings.

Input format
Input number of elements
Input each string on a separate line

Output format
Print the list of strings sorted by their length

Sample testcases
Input 1             Output 1
3                   [b, aa, ccc] 
aa
b
ccc

 */
import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<num;i++)
        {
            list.add(sc.next());
        }
        Collections.sort(list,Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
