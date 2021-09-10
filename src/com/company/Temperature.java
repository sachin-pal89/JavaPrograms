package com.company;
import java.io.*;

public class Temperature {
    public static void main(String[] args)throws Exception
    {
        // Code for Conversion in temperature calculation;

        float clesius,fahrenheit;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Temperature in fahrenheit: ");
        fahrenheit = Float.parseFloat(br.readLine() );

        clesius = ((fahrenheit-32) * 5)/9;
        System.out.println("Temperature in clesius is: ");
        System.out.println(clesius);

       System.out.println("Enter the Temperature in Clesius: ");
       clesius = Float.parseFloat(br.readLine() );

        fahrenheit = ((9*clesius)/5)+32;
        System.out.println("Temperature in fahrenheit is: ");
        System.out.println(fahrenheit);



    }
}
