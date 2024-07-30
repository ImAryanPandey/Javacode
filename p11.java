// Reverse Counter input Numbers using do-while loop

import java.util.*;
public class p11
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int i = sc.nextInt();
        System.out.println("Reverse Counter : ");
        do
        {
            System.out.println(i);
            i--;
        }
        while(i>=1);
    }
}