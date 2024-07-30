//Find Area of Rectangle using user defined method

import java.util.*;
class p19
{
    public static int area(int l, int b)
    {
        return l*b;
    }
    public static void main(String [] args)
    {
        int x,y,a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Rectange : ");
        x = sc.nextInt();
        System.out.print("Enter Breadth of Rectange : ");
        y = sc.nextInt();
        System.out.println("Area of Rectange = "+area(x,y));
    }
}