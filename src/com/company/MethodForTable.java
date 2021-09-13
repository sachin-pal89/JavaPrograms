package com.company;
import java.util.*;

public class MethodForTable {

    // This program is to crete a multiplication table using a method

    //Method for multiplication
    static int multi(int n,int m)
    {
        int sum = n*m;
        return sum;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number whose multiplication is to be found: ");
        int n = sc.nextInt();

        for(int i=1;i<11;i++)
        {
            System.out.printf("%d x %d = %d\n",n,i,multi(n,i));
        }

    }
}
