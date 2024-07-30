interface MyInterface
{
    void m1(); //Public abstract method void m1()
    void m2(); //Public abstract method void m2()
    void m3(); //Public abstract method void m3()
}

class TestInterface implements MyInterface
{
    public void m1()
    {
        System.out.println("This Message from m1()");
    }
    public void m2()
    {
        System.out.println("This Message from m2()");
    }
    public void m3()
    {
        System.out.println("This Message from m3()");
    }
}
class InterfaceDemo1
{
    public static void main(String[] args)
    {
        TestInterface ti=new TestInterface();
        ti.m1();
        ti.m2();
        ti.m3();
    }
}