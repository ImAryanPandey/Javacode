//Two Strings as Input and compare them for equality

import java.util.*;
class p15
{
public static void main(String[] args)
{
String str1, str2;
Scanner sc=new Scanner(System.in);
System.out.print("Enter First String :");
str1=sc.nextLine();
System.out.print("Enter Second String :");
str2= sc.nextLine();
/*
if(str1.equals(str2))
{
System.out.println("Both Strings are Equal");
}
else
{
System.out.println("Both Strings are not Equal");
}}}*/

if(str1.equalsIgnoreCase(str2))
{
System.out.println("Both Strings are Equal");
}
else
{
System.out.println("Both Strings are not Equal");
}}}