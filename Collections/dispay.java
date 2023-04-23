/*
 Create a class ArrayListMain and in the occurences method get the names and store them in an ArrayList.
 After getting all the names, just display them in the same order.

Input format
Number of names(N) in first line as integer
N names in separate lines

Output format
Print the names

Sample testcases
Input 1             Output 1
6                   KL Rahul
KL Rahul            Hetmyer
Hetmyer             Pierre
Pierre              Dube
Dube                Walsh
Walsh               Pant
Pant

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayListMain {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> list=new ArrayList<String>(n);
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextLine());
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(list.get(i));
        }
}
}