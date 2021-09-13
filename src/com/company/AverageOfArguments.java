package com.company;
import java.util.*;

public class AverageOfArguments {
    // This program would find average of argument pass in method

    //Method to find average
    static float avg(float ...arr)
    {
        float average=0.0f,sum=0.0f;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        average = sum/(arr.length);
        return average;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.printf("The average of the argument 22,54,99.2f,77.4f,99.345f in method avg() is: %.4f",avg(22,54,99.2f,77.4f,99.345f));

    }
}
