package com.company;
import java.util.*;

public class MatrixAddition {
    public static void main(String[] args)
    {
        //This program is to add 2x3 matrices
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][3];
        int[][] b = new int[2][3];

        System.out.println("Enter the element of the First array: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element of the Second array: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Resultant array after addition of above two array is: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.printf("%d ",a[i][j] + b[i][j]);
            }
            System.out.println();
        }


    }
}
