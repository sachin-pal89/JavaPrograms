package com.company;
import java.util.*;

public class AverageByForEach {
    public static void main(String[] args)
    {
        //This program is to find the average marks of the student using for each loop
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of student whose physics marks is available: ");
        int n = sc.nextInt();

        float[] marks = new float[n];
        System.out.println("Enter the marks obtained by student in the physics subject: ");

        float sum =0.0f;
        for(float element : marks)
        {
            element = sc.nextInt();
            sum += element;
        }

        // To calculate the average marks obtain by students in physics
        float avg = (sum/n);
        System.out.printf("The average marks obtain by students in physics is: %.2f",avg);
    }
}
