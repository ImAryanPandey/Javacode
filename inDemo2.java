
import java.util.*;
class Shape
{
    int s;  // instance variable (It holds Side)
    public void setValue(int side)
    {
        s=side;
    }
}

class Square extends Shape
{
    public int area()
    {
        return s*s;
    }
}

class Cube extends Shape
{
    public int volume()
    {
        return s*s*s;
    }
}
class inDemo2{
    public static void main(String [] args)
    {
        int x,a,v;
        Scanner sc = new Scanner(System.in);
        Square sq=new Square();
        System.out.println("Enter the Side of Square : ");
        x=sc.nextInt();
        sq.setValue(x);
        a=sq.area();
        System.out.println("Area of Square = "+a);
        Cube cu=new Cube();
        System.out.print("Enter Side of Cube : ");
        x=sc.nextInt();
        cu.setValue(x);
        v=cu.volume();
        System.out.println("Volume of Cube = "+v);
    }
}