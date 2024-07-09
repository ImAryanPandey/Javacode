//Find Greatest Number in 3 Unequal Number

import java.util.*;
public class p5
{
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a=sc.nextInt();
        System.out.print("Enter Second Number : ");
        b=sc.nextInt();
        System.out.print("Enter Third Number : ");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Greatest Number = "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Greatest Number = "+b);
        }
        else
        {
            System.out.println("Greatest Number = "+c);
        }
    }   
}