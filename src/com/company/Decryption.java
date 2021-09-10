package com.company;
import java.util.*;

public class Decryption {
    public static void main(String[] args){

        char grade;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the encrypted grade: ");
        grade = s.next().charAt(0);

        char finalGrade = (char)(grade - 8);

        System.out.println("The decrypted grade is: ");
        System.out.println(finalGrade);
    }
}
