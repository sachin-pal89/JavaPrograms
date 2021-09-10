package com.company;
import java.util.*;

public class LeapYear {
    public static void main(String[] args)
    {
        // Program is for checking wether the given year is Leap year or not
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.println("Enter the year: ");
        year = sc.nextInt();

        if(year<0)
            System.out.println("User Masti Nahi Bikul Masti Nahi");
        else {
            if ((year % 4) == 0)
                System.out.printf("%d is a Leap Year\n", year);
            else
                System.out.printf("%d is not a Leap Year\n", year);
        }
    }
}
