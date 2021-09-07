package com.company;
import java.util.*;

public class Calculator {
    public static void main(String[] args)
    {
        // Simple Code for Calculator
        int a,b,result=0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Code according to the operation that is to be performed: ");
        System.out.println("1: Addition ");
        System.out.println("2: Subtraction ");
        System.out.println("3: Multiplication ");
        System.out.println("4: Division \n");

        int c = s.nextInt();
        if(c>4)
        {
            System.out.println("Enter a valid option ");
            return;
        }


        System.out.print("\nEnter 2 Numbers: ");
        a = s.nextInt();
        b = s.nextInt();

        if(c==1)
            result = a+b;
        else if(c==2)
        {
            if(a>b)
                result = a-b;
            else
                result = b-a;
        }
        else if(c==3)
            result = a*b;
        else
        {
            if(a>b)
                result = a/b;
            else
                result = b/a;
        }

        System.out.println("The result of the performed operation is: ");
        System.out.println(result);
    }
}
