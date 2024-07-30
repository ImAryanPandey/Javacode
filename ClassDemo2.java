//Create Class Employee. In Employee class three variables employee and salary. In Employee Class create two methods setValue() and display(). Setvalue() method initializes variables and display() method print values of variables.

class Employee{
    int empid; //instance variable
    String empname; //instance variable
    double salary; //instance variable
    public void setValue(int eid, String ename, double sal)
    {
        empid=eid;
        empname=ename;
        salary=sal;
    }
    public void display()
    {
        System.out.println("Employee ID : "+empid);
        System.out.println("Employee Name : "+empname);
        System.out.println("Employee Salary : "+salary);
    }
}
class ClassDemo2
{
    public static void main(String args[])
    {
        Employee e1=new Employee(); //object creation
        e1.setValue(1001, "Ram", 25000.00);
        e1.display();
        Employee e2=new Employee();
        e2.setValue(1002, "Shyam", 30000.00);
        e2.display();
    }
}