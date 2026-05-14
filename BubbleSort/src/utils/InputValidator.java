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
    public int doInputPositiveInt(String prompt) {
        int value;
        //loop: keep asking until the user enters a valid positive integer
        while (true) {
            System.out.println(prompt);
            try {
                value = Integer.parseInt(scanner.nextLine().trim());
                //condition: check if value is greater than 0
                if (value > 0) {
                    return value;
                }
                System.out.println("Value must be positive.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }
}
