package homework_week_3;

import java.util.Scanner;

/** 1. Write a Java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programmer_1_OddEvenTernaryOperator {
    public static void main(String[] args){
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        isItOddEvenNumber(number);
        // Closing the scanner object
        scanner.close();

    }
    // Checking the number is odd or even
    public static void isItOddEvenNumber(int number){
        // ternary operator is used.
        String evenOrOdd = (number % 2 == 0 ) ? "Even" : "odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}
