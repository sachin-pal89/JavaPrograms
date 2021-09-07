package com.company;
import java.util.Scanner;

public class Result {
    public static void main(String[] args)
    {
        // Code to get Result of a student
        float a,b,c,d,e;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter marks for sub1 out of 100: ");
        a = s.nextInt();
        System.out.println("Enter marks for sub2 out of 100: ");
        b = s.nextInt();
        System.out.println("Enter marks for sub3 out of 100: ");
        c = s.nextInt();
        System.out.println("Enter marks for sub4 out of 100: ");
        d = s.nextInt();
        System.out.println("Enter marks for sub5 out of 100: ");
        e = s.nextInt();

        double percentage;

        percentage = ((a+b+c+d+e)/500)*100;

        System.out.print("The Percentage of marks you got is: ");
        System.out.println(percentage);
    }
}
