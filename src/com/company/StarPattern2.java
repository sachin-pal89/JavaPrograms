package com.company;
import java.util.*;

public class StarPattern2 {
    //This program is to print the pattern
    // * * * *
    // * * *
    // * *
    // *

    // Method for Pattern
    static void pattern(int rows)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=rows-i;j>0;j--)
            {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of rows in the pattern: ");
        int n = sc.nextInt();

        pattern(n);

    }
}
