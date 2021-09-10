package com.company;
import java.util.*;

public class Loops {
    public static void main(String[] args)
    {
        // This is program to use looping condition
        Scanner sc = new Scanner(System.in);

        // While loop

        int n = 100;
        System.out.println("Numbers from 100 to 200 is printed as: ");

        while(n<=200)
        {
            System.out.printf("%d ",n);
            n++;
        }
        System.out.println(" ");


        // Do while loop

        int in;
        System.out.println(" ");
        System.out.println("Enter how many terms of natural number is to be printed: ");
        in = sc.nextInt();
        System.out.println(" ");

        System.out.printf("First %d natural number are:\n",in);

        int x = 1;
        do {
            System.out.printf("%d ",x);
            x++;
        } while(x<in+1);
        System.out.println(" ");


        // For loop

        System.out.println(" ");
        System.out.printf("First %d natural number in reverse order are:\n",in);

        for(int i=in;i>0;i--)
        {
            System.out.printf("%d ",i);
        }
        System.out.println(" ");
    }
}
