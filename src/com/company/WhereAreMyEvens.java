package com.company;
import java.util.*;

public class WhereAreMyEvens {
    public static void main(String[] args)
    {
        // Program is for getting sum of all even numbers upto certain no.of terms
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the no.of first even number to be found ");
        n = sc.nextInt();

        int i=0,sum=0;
        while(i<=n)
        {
            if((i%2)==0)
                sum += i;

            i++;
        }
        System.out.printf("Sum of first %d even numbers is: %d",n,sum);
    }
}
