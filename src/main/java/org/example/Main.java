package org.example;

import jnr.ffi.annotations.In;

import java.util.Scanner;

public class Main {
    public static String GRADE;
    public static Integer CREDITS;

    //gpa = Total points / total credits
    // points = grade value * credits
    // A= 4, B= 3 ...
    public static void main(String[] args) {


        moreClasses();


    }

    public static void moreClasses() {
        Scanner scanner = new Scanner(System.in);
        Integer totalPoints = 0;
        Integer totalCredits = 0;
        Integer gradeValue = 0;
        boolean validGrade = true;

        boolean response = false;

        do {
            validGrade = true;
            System.out.println("Enter number of credits:");
            CREDITS = Integer.valueOf(scanner.nextLine()); // Read user input
            System.out.println("No. of credits are : " + CREDITS); //Output username

            System.out.println("Enter grade:");
            GRADE = scanner.nextLine(); // Read user input
            System.out.println("Grade is : " + GRADE); //Output username

            switch (GRADE.toUpperCase()) {
                case "A":
                    gradeValue = 4;
                    break;

                case "B":
                    gradeValue = 3;
                    break;

                case "C":
                    gradeValue = 2;
                    break;

                case "D":
                    gradeValue = 1;
                    break;

                case "F":
                    gradeValue = 0;
                    break;

                default:
                    System.out.println("Please enter valid grades: ");
                    validGrade = false;

            }

            while (!validGrade) ;

            int points = gradeValue * CREDITS;

            System.out.println("Points:" + points);


            totalPoints += points;
            totalCredits += CREDITS;
            System.out.println("Total Points: " + totalPoints);
            System.out.println("Total Credits: "+totalCredits);


            System.out.println("Do you want to add another class? : (Y/N)");
            String moreClasses = scanner.nextLine();
            response = moreClasses.equalsIgnoreCase("Y");
        }
        while (response) ;

        Double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);
        System.out.println("GPA is : " + gpa);

    }
}