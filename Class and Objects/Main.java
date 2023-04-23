/*
Create a class with two methods one to read the elements of an array and the other to find 
all pairs of elements in an array whose sum is equal to a specified number.

Input Format:
The first line of the input consists of the value of n.
Next input is the array elements.
The last input is the sum value.

Output Format:
The output prints the pair whose sum is equal to a specified number.

Sample Testcase:
Input               Ouput
5                     3 5
1 2 3 4 5             4 4
8                     5 3

*/
import java.util.*;
class get
{
    void print(int num,int arr[],int num1)
    {
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                if(arr[i]+arr[j]==num1)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int [num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int num1=sc.nextInt();
        get p=new get();
        p.print(num,arr,num1);
    }
}

