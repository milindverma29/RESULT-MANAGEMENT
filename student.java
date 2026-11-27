package com.resultmanagement;

import java.util.Scanner;

public class student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Students:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] rollnumbers = new int[n];
        int[] totals = new int[n];
        double[] percentages = new double[n];

       
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Student Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Student Roll No: ");
            rollnumbers[i] = sc.nextInt();

            System.out.print("Enter Maths Marks: ");
            int mathsmarks = sc.nextInt();

            System.out.print("Enter English Marks: ");
            int englishmarks = sc.nextInt();

            System.out.print("Enter Physics Marks: ");
            int physicsmarks = sc.nextInt();

            System.out.print("Enter Chemistry Marks: ");
            int chemistrymarks = sc.nextInt();

            System.out.print("Enter Physical Education Marks: ");
            int physicaleducationmarks = sc.nextInt();

            sc.nextLine();

           
            totals[i] = mathsmarks + englishmarks + physicsmarks
                    + chemistrymarks + physicaleducationmarks;

           
            percentages[i] = (totals[i] / 500.0) * 100;
        }

        System.out.println("\n====== STUDENT RESULT ======");

        System.out.printf("%-15s %-12s %-12s %-12s%n",
                "Name", "Roll No", "Total", "Percentage");

        for (int i = 0; i < n; i++) {

            System.out.printf("%-15s %-12d %-12d %.2f%%%n",
                    names[i],
                    rollnumbers[i],
                    totals[i],
                    percentages[i]);
        }

       
    }
}