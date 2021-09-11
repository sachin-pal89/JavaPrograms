package com.company;
import java.util.*;

public class ArrayElementSayPresent {
    public static void main(String[] args)
    {
        // This is to find wether the element is present in the array or not
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] find = new int[n];
        System.out.println("Enter the element in the array: ");
        for(int i=0;i<n;i++)
        {
            find[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be found from the given array: ");
        int x = sc.nextInt();
        int flag = -1;

        // To find an element
        for(int i=0;i<find.length;i++)
        {
            if(find[i]==x)
            {
                System.out.printf("Element found at index %d\n",i);
                flag =0;
                break;
            }
        }

        if(flag==-1)
            System.out.println("Element is not present in the array");
    }
}
