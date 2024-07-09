// Find Volume and Surface Area of Cuboid using User Input

import java.util.Scanner;

class s2
{
    public static void main(String [] args){
        int l,b,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length,breadth and height of cuboid");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        System.out.println("Volume ="+l*b*h);
        System.out.println("Surface Area ="+2*(l*b+b*h+h*l));
    }
}