// String Methods

import java.util.*;
class p14
{
public static void main(String [] args)
{
String name;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your Name : ");
name=sc.nextLine();
System.out.println("Name in upper case= "+name.toUpperCase());
System.out.println("Name in lower case= "+name.toLowerCase());
System.out.println("Length of your name= "+name.length());
}}