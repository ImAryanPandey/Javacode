//Program to find the greatest number in two unequal numbers

import java.util.*;
class p4
{
    public static void main(String [] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        a=sc.nextInt();
        System.out.print("Enter Second Number:");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("Greatest number = "+a);
        }
        else
        {
            System.out.println("Greatest Number = "+b);
        }
    }
}