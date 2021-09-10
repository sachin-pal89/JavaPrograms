package com.company;
import java.util.*;

public class Multiplication {
    public static void main(String[] args)
    {
        // Program to print multiplication table of given number
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number whose multiplication table is to be printed: ");
        int n = sc.nextInt();

        int i=1;
        while(i<=10)
        {
            System.out.printf("%d * %d = %d\n",n,i,(n*i));
            i++;
        }

    }
}
