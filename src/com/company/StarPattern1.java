package com.company;
import java.util.*;

public class StarPattern1 {

    // This program is to print pattern like
    // *
    // * *
    // * * *
    // * * * *

    //Method for pattern designing
    static void pattern(int rows)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of rows in pattern: ");
        int rows = sc.nextInt();

        pattern(rows);

    }
}
