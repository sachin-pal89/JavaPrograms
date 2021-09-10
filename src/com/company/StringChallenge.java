package com.company;
import java.util.*;

public class StringChallenge {
    public static void main(String[] args)
    {
        // Code for Java practice set of string
        Scanner sc = new Scanner(System.in);

        // To print the index if we obtain two spaces in string
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.printf("Double spaces start at: %d\n",str.indexOf("  "));
        System.out.printf("Triple spaces start at: %d\n",str.indexOf("   "));

        // To print the given string in letter format
        String letter = "Dear Friend, I Hope That Your Good. Thanks";
        int end = letter.length();
        int a1 = letter.indexOf(",",5);
        int a2 = letter.indexOf(".");

        System.out.printf("%s\n",letter.substring(0,a1));
        System.out.printf("\f%s\n",letter.substring(a1+1,a2));
        System.out.printf("\r%s",letter.substring(a2+1,end));
    }
}
