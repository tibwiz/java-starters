package com.abh.java.inout;

import java.util.Scanner;

/**
 * Scanner to read from consoler input and file.
 *
 * @author Abhilash
 *
 */
public class Scanners {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before");
        String input = "";
        while (scanner.hasNext()) {
            input = scanner.next();
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
        System.out.println("After");
        scanner.close();

        scanner = new Scanner(Scanner.class.getResourceAsStream("/com/abh/java/inout/input.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        scanner.close();

    }
}
