package com.company;
import java.util.*;

public class SumOfNaturalNoRecursively {
    // This program is to get sum of natural no recursively

    // Recursive Method for Sum of n natural number
    static int sum(int n)
    {
        if(n==0)
            return 0;

        return n + sum(n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of terms whose sum is to be found: ");
        int n = sc.nextInt();

        System.out.printf("Sum of %d natural number is: %d\n",n,sum(n));

    }
}
