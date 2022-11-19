/*
 Using Java Library ArrayList as a List Interface implementation, input N integers from standard input and add 
 to the list only if they form an increasing sequence.

1.Take a number, N > 0 as input
2.Accept N integers as input 
3.Add the number to the list only if it forms an increasing sequence else ignore
4.Print the list

Input format
Input number of elements, N > 0
Enter each integer on the next N lines

Output format
List of integers in increasing sequence ignoring out of order elements
Sample testcases
Input 1                 Output 1
7                       [3, 5, 9, 11, 13]
3
5
9
1
11
7
13


 */
import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>(num);
        for(int i=0;i<num;i++)
        {
            list.add(sc.nextInt());
        }
        for(int i=0;i<num;i++)
        {
            if(list.get(i)%2==0)
            {
                System.out.print(list.get(i));
            }
        }
    }
}
