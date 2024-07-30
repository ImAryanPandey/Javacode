// Find the Sum of two Numbers using a user-defined method

import java.util.*;

class p18
{
    public static int add(int x, int y)
    {
        return (x+y);
    }
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=add(a,b);
        System.out.println("Sum = "+c);
    }
}