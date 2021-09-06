package com.company;
import java.util.Scanner;

public class Sum2 {

    public static void main(String[] args)
    {
        System.out.println("Sum of Numbers ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Num1: ");
        int x = s.nextInt();
        System.out.println("Enter Num2: ");
        int y = s.nextInt();

        int sum = x+y;
        System.out.println("Sum of given number is: ");
        System.out.println(sum);
    }
}
