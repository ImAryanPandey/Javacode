// Print Table of Given Number

import java.util.*;
public class p10{
    public static void main(String [] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        for(int i=1; i<10; i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}