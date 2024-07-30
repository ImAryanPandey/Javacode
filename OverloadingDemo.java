//Method Overloading

import java.util.*;
class Figure
{
    public int area(int s) //Area of Square
    {
        return s*s;
    }
    public int area(int l, int b) //Area of Rectangle
    {
        return l*b;
    }
}
class OverloadingDemo
{
    public static void main(String [] args)
    {
        int s, l, b, a1, a2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Side of Square : ");
        s=sc.nextInt();
        System.out.print("Enter the Length of Rectangle : ");
        l=sc.nextInt();
        System.out.print("Enter the Breadth of Rectangle : ");
        b=sc.nextInt();
        Figure obj=new Figure();
        a1=obj.area(s);
        System.out.println("Area of Square = "+a1);
        a2=obj.area(l, b);
        System.out.println("Area of Rectangle = "+a2);
    }
}