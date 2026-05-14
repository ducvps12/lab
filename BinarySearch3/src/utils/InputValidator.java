/*
 * InputValidator - Handles user input validation
 * @author mtien
 */
package utils;

import java.util.Scanner;

public class InputValidator {

    private Scanner scanner;

    public InputValidator(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Prompts user until a valid positive integer is entered
     */
    public int inputPositiveInt(String prompt) {
        int number;
        //loop: keep asking until valid input is received
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            //condition: check if input is empty
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty!");
                continue;
            }
            try {
                number = Integer.parseInt(input);
                //condition: number must be positive
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Please enter a positive integer > 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
    }

    /**
     * Prompts user for any integer (positive or negative)
     */
    public int inputInteger(String prompt) {
        //loop: keep asking until valid integer is entered
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            //condition: check if input is empty
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty!");
                continue;
            }
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
    }
}
