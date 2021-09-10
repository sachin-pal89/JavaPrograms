package com.company;
import java.util.*;

public class ReverseMultiplication {
    public static void main(String[] args)
    {
        // Program is to print multiplication table of given number in reverse order
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number whose reverse multiplication table is to be printed: ");
        int n = sc.nextInt();

        int i=10;
        while(i>0)
        {
            System.out.printf("%d * %d = %d\n",n,i,(n*i));
            i--;
        }

    }
}
