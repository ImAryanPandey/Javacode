// Find Division of Two Numbers & Exception Handling

import java.util.*;
class ExDemo1
{
    public static void main(String [] args)
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        try
        {
        System.out.print("Enter First Number : ");
        x=sc.nextInt();
        System.out.print("Enter Second Number : ");
        y=sc.nextInt();
        z=x/y;
        System.out.println("Result = "+z);
        }
        catch(InputMismatchException e1)
        {
            System.out.println("Enter Numbers Only");
            System.out.println("Exception Name : "+e1);
        }
        catch(ArithmeticException e2)
        {
            System.out.println("Second Number Should Not Be 0");
            System.out.println("Exception Name : "+e2);
        }
        finally
        {
            System.out.println("End of Program");
        }
    }
}