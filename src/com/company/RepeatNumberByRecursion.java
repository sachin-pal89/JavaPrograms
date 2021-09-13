package com.company;
import java.util.*;

public class RepeatNumberByRecursion {
    // this program is to print a number multiple time using recursive method

    //method to repeat the number
    static void repeat(int n,int times)
    {
        if(times==0)
            return;

        System.out.print(n+" ");
        repeat(n,times-1);
        return;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number which is to be repeated: ");
        int n = sc.nextInt();

        System.out.println("Enter how many times to repeat "+n);
        int times = sc.nextInt();

        repeat(n,times);

    }
}
