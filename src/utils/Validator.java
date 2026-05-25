/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author Precision 5530
 */
public class Validator {

    private static final Scanner SCANNER = new Scanner(System.in);

    private Validator() {
    }

    public static int getInput(String Inputmsg, String OutOfRangemsg,
            String InvalidFormatmsg, int min, int max) {
        do {
            try {
                System.out.println(Inputmsg);
                int number = Integer.parseInt(SCANNER.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println(OutOfRangemsg);
                }
            } catch (NumberFormatException e) {
                System.out.println(InvalidFormatmsg);
            }
        } while (true);
    }
}
