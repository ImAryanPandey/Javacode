//Find The Area & Perimeter of Rectange using User Input

import java.util.Scanner;
class s1
{
public static void main(String [] args){
int a,b;
Scanner in=new Scanner(System.in);
System.out.println("Enter the length and breadth of rectangle");
a=in.nextInt();
b=in.nextInt();
System.out.println("Area="+a*b);
System.out.println("Perimeter="+2*(a+b));
}
}