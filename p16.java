//Word Counter

import java.util.*;
class p16
{
public static void main(String [] args)
{
String sen;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Sentence : ");
sen=sc.nextLine();
String [] words=sen.split(" ");
System.out.println("Number of Words ="+words.length);
}}