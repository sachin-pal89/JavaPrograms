package com.company;
import java.util.*;

public class StringMania {
    public static void main(String[] args)
    {
        // This code is to get a hand's on strings in java
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        name = sc.nextLine();

        // To print length of string
        System.out.printf("Length: %d\n",name.length());

        // To print given string in uppercase
        System.out.printf("Upper case: %s\n",name.toUpperCase());

        // To print given string in lowercase
        System.out.printf("Lower case: %s\n",name.toLowerCase());

        // To print a substring
        System.out.printf("Substring: %s\n",name.substring(3,7));

        // To print replace a character in string with any other character
        System.out.printf("Replaced String: %s\n",name.replace(' ','_'));

        // To print the character present in the given position
        System.out.printf("Character at 4: %c\n",name.charAt(4));

        // To print the index where the character is present in string
        System.out.printf("Index at which \'n\' is present: %d\n",name.indexOf('n'));

        // To concatenate a string
        name = name.concat("89");
        System.out.printf("Apka pura naam ye hai: %s\n",name);

    }
}
