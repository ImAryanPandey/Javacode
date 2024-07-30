//Program to convert Temperature from centigrade to Fahrenheit and Fahrenheit to centigrade based on user Choice using Switch Case!

import java.util.*;
class p7
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Centigrade to Fahrenheit");
        System.out.println("2. Fahrenheit to Centigrade");
        System.out.println("Enter Your Choice : ");
        int choice = sc.nextInt();
        System.out.println("Enter Temperature : ");
        int temp = sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                double f = (temp*9/5)+32;
                System.out.println("Temperature in Fahrenheit : "+f);
                break;
            }
            case 2:
            {
                double c = (temp-32)*5/9;
                System.out.println("Temperature in Centigrade : "+c);
                break;
            }
            default:
            {
                System.out.println("Invalid Choice!");
            }
        }    
    }
}  