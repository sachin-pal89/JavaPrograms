package com.company;
import java.io.*;

public class HowMuchTaxYouGive {
    public static void main(String[] args)throws Exception
    {
        // Program to check How much tax you pay
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float salary;
        double incomeTax;

        System.out.println("Enter your Annual Salary in terms of Lakhs: ");
        salary = Float.parseFloat(br.readLine());

        if(salary<2.5f)
            System.out.println("You Don't need to pay Income Tax: ");
        else if(salary >= 2.5f && salary < 5.0f)
        {
            salary = (float) (salary * Math.pow(10,5));
            incomeTax = ((salary*5)/100);
            System.out.printf("You pay Income Tax of %.2f Thousand ",incomeTax);
        }
        else if(salary >= 5.0f && salary <= 10.0f)
        {
            salary = (float) (salary * Math.pow(10,5));
            incomeTax = ((salary*20)/100);
            System.out.printf("You pay Income Tax of %.2f Lakhs ",incomeTax);
        }
        else
        {
            salary = (float) (salary * Math.pow(10,5));
            incomeTax = ((salary*30)/100);
            System.out.printf("You pay Income Tax of %.2f Lakhs ",incomeTax);
        }
    }
}
