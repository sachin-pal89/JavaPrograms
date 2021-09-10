package com.company;
import java.util.*;

public class PrintName {
	public static void main(String[] args) {
		
		//Code For Printing Full Name of User
		String s,b,c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your First Name: ");
		s = sc.nextLine();

		System.out.println("Enter your Middle Name: ");
		b = sc.nextLine();

		System.out.println("Enter your Last Name: ");
		c = sc.nextLine();

		String result;
		result = s+" "+b+" "+c;

		System.out.println("Your Full Name is: ");
		System.out.println(result);
	}
}


