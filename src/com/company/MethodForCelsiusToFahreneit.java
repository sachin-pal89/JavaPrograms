package com.company;
import java.util.*;

public class MethodForCelsiusToFahreneit {
    // This program is convert celsius to fahreneit by using method

    //Method for temperature conversion
    static float convertC(float celsius)
    {
        return ((celsius*9)/5)+32;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in celsius: ");
        float celsius = sc.nextFloat();

        System.out.printf("%.2f degree celsius is equal to %.2f fahreneit\n",celsius,convertC(celsius));

    }
}
