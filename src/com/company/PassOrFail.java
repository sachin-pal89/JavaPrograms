package com.company;
import java.util.*;

public class PassOrFail {
    public static void main(String[] args)
    {
        // This is to check whether a student pass the exam or not
        Scanner sc = new Scanner(System.in);

        float s1,s2,s3;
        float r1,r2,r3,rf;

        System.out.println("Enter the marks obtain in first subject out of 100: ");
        s1 = sc.nextFloat();
        System.out.println("Enter the marks obtain in second subject out of 100: ");
        s2 = sc.nextFloat();
        System.out.println("Enter the marks obtain in third subject out of 100: ");
        s3 = sc.nextFloat();

        if((s1<0 || s1>100) || (s2<0 || s2>100) || (s3<0 || s3>100))
        {
            System.out.println("Give a Valid marks out of 100");
        }
        else {
            r1 = (s1 / 100) * 100;
            r2 = (s2 / 100) * 100;
            r3 = (s3 / 100) * 100;

            rf = ((s1 + s2 + s3) / 300) * 100;

            if (rf >= 40 && r1 >= 33 && r2 >= 33 && r3 >= 33) {
                System.out.println("Student is Pass: ");
                System.out.printf("He got %.2f percent in subject 1\n", r1);
                System.out.printf("He got %.2f percent in subject 2\n", r2);
                System.out.printf("He got %.2f percent subject 3\n", r3);
                System.out.printf("He got %.2f percent on Average\n", rf);
            }
            else {
                System.out.println("Student fails in the exam");
            }
        }
    }
}
