/*
 While entering user names, We have to be very careful about the duplicate entries in the list.

To make a correct and perfect report, we have to remove the duplicate elements in the list. 
Write a program that obtains a set of names and a search element and prints its frequency.

Input format
The first line of the input consists of the number of names.
The next input is the user names.
The last input is the user name to be searched.

Output format
The output prints the frequency of the searched element.

Sample testcases
Input 1                 Output 1
5                           2
alice
bob
ankit
alice
prajit
alice

 */
import java.util.*;
class frequency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<String> list=new ArrayList<String>(num);
        for(int i=0;i<num;i++)
        {
            list.add(sc.nextLine());
        }
        String com=sc.nextLine();
        System.out.println(Collections.frequency(list,com));
    }
}