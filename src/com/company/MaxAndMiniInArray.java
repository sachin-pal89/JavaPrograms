package com.company;
import java.util.*;

public class MaxAndMiniInArray {
    public static void main(String[] args)
    {
        //This program is to find the maximum and minimum element in array
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of element in the array: ");
        int n = sc.nextInt();

        int[] m = new int[n];
        System.out.println("Enter the element of an array: ");
        for(int i=0;i<n;i++)
        {
            m[i] = sc.nextInt();
        }

        //To find maximum and minimum in the array
        int max=m[0], min=m[0];
        for(int i=0;i<n;i++)
        {
            if(m[i]>max)
                max = m[i];

            if(m[i]<min)
                min = m[i];
        }

        System.out.printf("Maximum element in the array is: %d\nMinimum element in the array is: %d",max,min);

    }
}
