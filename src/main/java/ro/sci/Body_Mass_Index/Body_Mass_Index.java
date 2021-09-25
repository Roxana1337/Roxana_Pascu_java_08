package ro.sci.Body_Mass_Index;

import java.util.Scanner;

public class Body_Mass_Index {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert the height of the pacient in centimeters: ");
        int pacientHeight = scanner.nextInt();
        System.out.println("Please insert the weight of the pacient in kilograms: ");
        int pacientWeight = scanner.nextInt();

        double bodyMassIndex = pacientWeight / (pacientHeight * pacientHeight * 0.0001);


        if (bodyMassIndex <= 18.49)
            System.out.println("The pacient is underweight");
        else
            if(bodyMassIndex >= 18.50 && bodyMassIndex < 24.99)
                System.out.println("The pacient has normal weight");
            else
                if(bodyMassIndex >= 25 && bodyMassIndex < 29.99)
                    System.out.println("The pacient is overweight");
                else
                    if(bodyMassIndex >= 30 && bodyMassIndex < 34.99)
                        System.out.println("The pacient has grade I obesity");
                    else
                        if(bodyMassIndex >= 35 && bodyMassIndex < 40)
                            System.out.println("The pacient has grade II obesity");
                        else
                            if(bodyMassIndex >= 40)
                                System.out.println("The pacient has morbid obesity");

        System.out.printf("The body mass index is: %.2f", bodyMassIndex);
    }

}
