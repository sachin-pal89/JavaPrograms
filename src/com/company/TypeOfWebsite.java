package com.company;
import java.util.*;

public class TypeOfWebsite {
    public static void main(String[] args)
    {
        // Program to check the type of url
        Scanner sc = new Scanner(System.in);

        String url;
        System.out.println("Enter the url whose type is to be found");
        url = sc.nextLine();

        int x = url.indexOf(".");
        String domain = url.substring(x,url.length());

        switch(domain)
        {
            case ".com":
                System.out.printf("%s is a Commercial Website ",url);
                break;

            case ".org":
                System.out.printf("%s is a Organization Website ",url);
                break;

            case ".in":
                System.out.printf("%s is an Indian Website ",url);
                break;

            default:
                System.out.println("Enter a valid url");
                break;
        }
    }
}
