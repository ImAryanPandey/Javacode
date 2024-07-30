//Demonstrate Concept of Inheritance

class RunDog
{
    public void bark()
    {
        System.out.println("Sheru...");
        System.out.println("Bhow Bhow...");
    }
}

class Bulldog extends RunDog
{
    public void growl()
    {
        System.out.println("Tuffy...");
        System.out.println("Gurr.... Gurrr...");
    }
}

class InDemo1
{
    public static void main(String [] args)
    {
        Bulldog dog = new Bulldog();  // Corrected: Class name and instance creation match
        dog.bark();
        dog.growl();
    }
}
