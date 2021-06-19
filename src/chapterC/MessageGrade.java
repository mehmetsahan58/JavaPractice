package chapterC;

import java.util.Scanner;

public class MessageGrade {

    public static void main (String args [] ) {

        System.out.println("Enter your letter grade");

        Scanner input = new Scanner (System.in);

        String grade = input.next();


        String grade1 = grade.toUpperCase();

        String message;

        switch (grade1) {

            case "A":
                message = "Excellent Job!";
                break;

            case "B":
                message = "Great Job!";
                break;

            case "C":
                message = "Good Job!";
                break;

            case "D":
                message = "You need to work harder!";
                break;

            case "F":
                message = "Uh oh!";
                break;

            default:
                message = "Error. Invalid entry";
                break;
        }

        System.out.println (message);

        }
}
