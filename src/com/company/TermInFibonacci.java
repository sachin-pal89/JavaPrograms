package com.company;
import java.util.*;

public class TermInFibonacci {
    // This program is to get the nth term in fibonacci series using method

    // recursive method for finding nth term of Fibonacci series
    static int term(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        return term(n-1)+term(n-2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No of term which is to be find: ");
        int n = sc.nextInt();

        System.out.printf("The %dth term in Fibonacci series is: %d",n,term(n));

    }
}
