// Find Factorial of Given Number using While loop

import java.util.*;

public class p9
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(n<=1)
        {
            System.out.println("Factorial is 1");
        }
        else
        {
            int fact = 1;
            while (n>1)
            {
                fact=fact*n;
                n--;
            }
            System.out.println("Factorial is "+fact);
        }

    }
}
        
    
