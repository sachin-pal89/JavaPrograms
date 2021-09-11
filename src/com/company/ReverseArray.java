package com.company;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args)
    {
        // This program is to print given array in reverse order
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of element in an array: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<n;i++)
        {
            marks[i] = sc.nextInt();
        }

        // To print it in reverse order
        System.out.println("The given string in reverse order is: ");
        for(int i=(marks.length-1);i>=0;i--)
        {
            System.out.printf("%d ",marks[i]);
        }

    }
}
