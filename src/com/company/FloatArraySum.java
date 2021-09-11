package com.company;
import java.util.*;

public class FloatArraySum {
    public static void main(String[] args)throws Exception
    {
        // This program  is to get the sum of the elements in the given array
        Scanner sc = new Scanner(System.in);

        float sum = 0;
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();

        float[] arr = new float[n];
        System.out.println("Enter the float value which is to be presented in the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextFloat();
        }

        // Sum of the array
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }

        System.out.printf("The sum of the element of array is: %f",sum);
    }
}
