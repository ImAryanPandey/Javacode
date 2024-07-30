class MyClass       //class
{
    public static void sayHello()   //method
    {
        System.out.println("Hello World");      //method
    }
}
class ClassDemo1        //class name
{
    public static void main(String [] args)
    {
       // MyClass m = new MyClass();  //creating object
        MyClass.sayHello();   //calling method
    }
}