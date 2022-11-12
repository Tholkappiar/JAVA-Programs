/*
Develop a program for banking system for account management. Each account has the following 
attributes:AccountID, HolderName and Balance . Declare one constructor with three parameters that 
initializes the three attributes to some default values. Attributes must be validated.
            AccountBalance - must be greater than or equal to zero. If not, it is set to zero.
            AccountId - must be between 100 and 999. If not, set to -1 to indicate that it invalid.

*/
import java.util.Scanner;
class account
{
    void thols(int a,String b,int c,int d,int e)
    {
        int id=a;
        String name=b;
        int bal=c;
        int cred=d;
        int nbal=e;
    }
}
class print extends account
{
    void get(int id,String name,int bal,int cred,int nbal)
    {
        if(id>100 && id<999)
        {
            System.out.print(id+" "+name);
        }
        else
        {
            System.out.print("-1"+" "+name);
        }
        if(bal>0)
        {
            System.out.println(" "+bal);
            System.out.println(bal + cred);
            System.out.println(bal + cred);
        }
        else
        {
            System.out.println(" 0");
            System.out.println(cred);
            System.out.println(cred);
        }
        if(nbal<-10000)
        {
            System.out.println("The balance can be negative but no less than -10000");
        }
        else
        {
            System.out.println(nbal);
        }
    }
}
class if_else_inheritance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=sc.next();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        print x=new print();
        x.get(a,b,c,d,e);
    }
}
