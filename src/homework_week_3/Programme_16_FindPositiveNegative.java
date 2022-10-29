package homework_week_3;
// Write a java program to check if enter number is "POSITIVE", "NEGATIVE" or "ZERO"

import java.util.Scanner;

public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        // Scanner Declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        // Closing the scanner object
        scanner.close();
    }
    // Finding the number is Positive Negative or Zero
    public static void findNumberIsPositiveNegativeOrZero(int number){
        if (number > 0){
            System.out.println(number + "is a POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + "is a NEGATIVE number");
        }else {
            System.out.println(number + "is ZERO");
        }
    }
}
