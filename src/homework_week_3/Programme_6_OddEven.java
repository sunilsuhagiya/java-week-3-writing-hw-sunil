package homework_week_3;

// Write a java program to input any number and find out if its odd or even

import java.util.Scanner;

public class Programme_6_OddEven {
    public static void main(String [] args){
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number = scanner.nextInt();
        Programme_6_OddEven oddEven = new Programme_6_OddEven();
        System.out.println(number + " is " + oddEven.isPtEvenOrOddNumber(number) + "number");
        // Closing the scanner object
        scanner.close();
    }
    // Checking the odd or even
    public String isPtEvenOrOddNumber(int number){
        if (number % 2 == 00){
            return "Even";
        }else {
            return "Odd";
        }
    }
}
