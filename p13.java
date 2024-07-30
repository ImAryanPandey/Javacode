// Program to Store Five Names in Array by USer Input and and display in lexical order

import java.util.*;

class p13
{
    public static void main(String[] args)
    {
        String [] name = new String[5];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 names : ");
        for(i=0; i<5; i++)
        {
            name[i] = sc.nextLine();
        }
        Arrays.sort(name);
        System.out.println("Names in Lexical order : ");
        for(i=0; i<5; i++)
        {
            System.out.println(name[i]);
        }
    }
}