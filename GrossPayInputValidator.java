package grosspayrate;

import java.util.Scanner;

/*
WHILE LOOp
Each store employee makes $15 an hour. Write a program that allows a manager to enter the number of weekly
hours worked for each employee and calculate their pay.
Do not allow for overtime
 */
public class GrossPayInputValidator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Initialize know variables
        int payRate =15;
        int maxHours = 40;

        // Get input
        System.out.println("How many hours did the employee work this week?");
        double hoursWorked = scanner.nextDouble();

        // Validate input
        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //Calculate gross
        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" +gross);
    }
}
