// P20 = Find Volume of Cuboid 

import java.util.*;

class Cuboid{   
    // If We Use Public Keyword then We have to keep Name of Class same as Name of File
    public int volume(int l, int b, int h) //non-static method
    {
        return (l*b*h);
    }
    public static void main(String [] args)
    {
        int l,b,h,v;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length,breadth and height of cuboid");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        Cuboid cu=new Cuboid();  // Object Creation
        cu.volume(l,b,h);      // calling non-static method
        v=cu.volume(l,b,h);     // calling static method
        System.out.println("Volume = "+v);
    }

}


// Here are the key differences between static and non-static members in Java:

// Association: Static members are linked to the class itself, while non-static members are tied to specific instances of the class12.

// Location: Static members are stored in the class data segment, while non-static members are stored in the instance data segment.

// Scope: Static members are accessible within the class, while non-static members are accessible within the class or within the instance.

// Memory Allocation: Static members are allocated memory once during class loading, whereas non-static members have separate memory for each instance34.

// Access: Static members can be accessed using the class name, while non-static members require an object reference.

// Initialization: Static members are initialized when the class is loaded, and non-static members are initialized when each instance is created