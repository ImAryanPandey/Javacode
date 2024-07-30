// Find Sum & Average of 10 Numbers using Array with input

import java.util.*;
public class p12
{
    public static void main(String[] args)
    {
        int [] arr = new int[10];
        int i, sum=0;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Numbers : ");
        for(i=0; i<10; i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        avg=sum/10.0;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
    }
}