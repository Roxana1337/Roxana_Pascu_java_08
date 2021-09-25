package ro.sci.VTA_Calculator;

import java.util.Locale;
import java.util.Scanner;

public class VTA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce the price of the product without VTA: ");
        double priceWithoutVTA = scanner.useLocale(Locale.ENGLISH).nextDouble();

        if (priceWithoutVTA > 0) {
            calculatePrice(priceWithoutVTA);
            System.out.println("The full price of the product is: " + calculatePrice(priceWithoutVTA));
        } else
            System.out.println("Please provide a valid price");
    }


    private static double calculatePrice(double priceWithoutVTA) {
        double VTA = 16;
        double priceWithVTA = priceWithoutVTA + VTA / 100 * priceWithoutVTA;
        return priceWithVTA;
    }
}
