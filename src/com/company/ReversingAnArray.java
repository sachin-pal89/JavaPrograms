package com.company;
import java.util.*;

public class ReversingAnArray {
    public static void main(String[] args)
    {
        //This program is to reverse the element in the array
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of element in the array: ");
        int n = sc.nextInt();

        int[] ele = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            ele[i] = sc.nextInt();
        }

        // Reversing an array
        for(int i=0;i<(ele.length)/2;i++)
        {
            int temp = ele[i];
            ele[i] = ele[ele.length-1-i];
            ele[ele.length-1-i] = temp;
        }

        System.out.println("The Reversed Array is: ");
        for(int i=0;i<ele.length;i++)
        {
            System.out.printf("%d ",ele[i]);
        }

    }
}
