package ro.sci.tema_greeting;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your first name into the console");
        String firstName = scanner.nextLine();
        System.out.println("Please type your last name into the console");
        String lastName = scanner.nextLine();
        if (firstName.length() == 0 && lastName.length() == 0) {
            System.out.println("Hello, stranger");
        } else {
            System.out.println("Hello, " + firstName + " " + lastName);
        }
    }
}
