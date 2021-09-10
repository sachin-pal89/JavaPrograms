package com.company;
import java.util.*;

public class PatternStuff {
    public static void main(String[] args)
    {
        // This code is to print pattern like below
        //  * * * *
        //  * * *
        //  * *
        //  *

        Scanner sc = new Scanner(System.in);

        int rows;
        System.out.println("Enter the no.of rows the pattern would contain: ");
        rows = sc.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=rows-i;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
