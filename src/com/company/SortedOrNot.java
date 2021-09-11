package com.company;
import java.util.*;

public class SortedOrNot {
    public static void main(String[] args)
    {
        // This program is to see wether the array is sorted or not
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of element in the array: ");
        int n = sc.nextInt();

        int[] tosort = new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++)
        {
            tosort[i] = sc.nextInt();
        }

        //Check wether sorted or not
        boolean flag=true;
        for(int i=0;i<n-1;i++)
        {
            if(tosort[i]>tosort[i+1])
            {
                flag = false;
                break;
            }
        }

        if(!flag)
            System.out.println("Array is not sorted");
        else
            System.out.println("Array is sorted");
    }
}
