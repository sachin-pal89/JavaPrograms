package com.company;
import java.util.*;

public class SumOfMultiples {
    public static void main(String[] args)
    {
        // Program is to Print the sum of all multiples of a number
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int multiSum=0;
        for(int i=1;i<11;i++)
        {
            multiSum += (n*i);
        }
        System.out.printf("Sum of first 10 multiple of %d is: %d",n,multiSum);

    }
}
