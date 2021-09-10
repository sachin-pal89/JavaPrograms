package com.company;
import java.util.*;

public class WhatsTheDay {
    public static void main(String[] args)
    {
        // Program to check which day it is
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Enter the number between 1-7 to get the corresponding day: ");
        number = sc.nextInt();

        switch(number)
        {
            case 1:
                System.out.println("It's Monday ");
                break;

            case 2:
                System.out.println("It's Tuesday ");
                break;

            case 3:
                System.out.println("It's Wednesday ");
                break;

            case 4:
                System.out.println("It's Thursday ");
                break;

            case 5:
                System.out.println("It's Friday ");
                break;

            case 6:
                System.out.println("It's Saturday ");
                break;

            case 7:
                System.out.println("It's Sunday ");
                break;

            default :
                System.out.println("Aa Can you give a valid number! ");
        }

    }
}
