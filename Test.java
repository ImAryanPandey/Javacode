import java.util.Scanner;
import mypack.MyUtil;
class Test
{
    public static void main(String [] args)
    {
        int a,b,s,g;
        Scanner sc = new Scanner(System.in);
        MyUtil mu=new MyUtil();
        System.out.print("Enter First Number : ");
        a=sc.nextInt();
        System.out.print("Enter Second Number : ");
        b=sc.nextInt();
        s=mu.add(a,b);
        System.out.println("Sum = "+s);
        g=mu.greatest(a,b);
        System.out.println("Greatest = "+g);
    }
}