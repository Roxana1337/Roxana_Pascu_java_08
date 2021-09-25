package ro.sci.tema_factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the number for which factorial you want to calculate");
        int myNumber = scanner.nextInt();
        int factorialOfMyNumber = 1;
        if (myNumber >= 1) {
            for (int i = 2; i <= myNumber; i++) {
                factorialOfMyNumber *= i;
            }
            System.out.println("The factorial for " + myNumber + " is" + factorialOfMyNumber);
        } else {
            System.out.println("Please provide a positive integer number");
        }
    }
}
