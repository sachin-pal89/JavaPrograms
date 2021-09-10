package com.company;
import java.util.*;

public class Factorial {
    public static void main(String[] args)
    {
        // Program is to print factorial of number using loop
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number whose factorial is to be found: ");
        int n = sc.nextInt();

        int facto=1;
        for(int i=1;i<=n;i++)
        {
            facto *= i;
        }
        System.out.printf("Factorial of given function is: %d\n",facto);
    }
}
