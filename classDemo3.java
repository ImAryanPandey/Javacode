// Demonstrate Concept of Constructor

import java.util.*;
class Rectangle 
{
    int length;  // instance variable
    int breadth;    // instance variable

    // constructor
    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
    int area()
    {
        return length * breadth;
    }
}
class classDemo3
{
    public static void main(String [] args)
    {
        int x,y,a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Rectangle : ");
        x=sc.nextInt();
        System.out.print("Enter Breadth of Rectangle : ");
        y=sc.nextInt();
        System.out.println("Area of Rectangle = "+new Rectangle(x,y).area());
    }
}