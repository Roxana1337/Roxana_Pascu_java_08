package ro.sci.prime_number;

import java.util.Scanner;

public class Prime_Number {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please insert a number");
            int myNumber = scanner.nextInt();

            if (myNumber > 0) {
                for (int i = 2; i < myNumber; i++) {
                    if (myNumber % i == 0) {
                        System.out.println(myNumber + " is not a prime number");
                        return;
                    }
                }
                System.out.println(myNumber + " is a prime number");
            } else
                System.out.println("Please provide a positive number");
        }
    }


