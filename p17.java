// Take Sentence as Input, and Replace One Word with another

import java.util.*;
class p17
{
public static void main(String [] args)
{
String sen, fw, rw;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Sentence : ");
sen=sc.nextLine();
System.out.print("Find What?");
fw=sc.nextLine();
System.out.print("Replace with :");
rw=sc.nextLine();
System.out.println("Modified sentence="+sen.replace(fw,rw));
}
}