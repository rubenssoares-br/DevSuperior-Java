package exercise_8;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double F, C;
        String scale;

        System.out.print("What scale are you going to enter a temperature on? (C/F)? ");
        scale = sc.nextLine();

        if (scale.equals("F")) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            F = sc.nextDouble();
            C = (F - 32) * 5.0 / 9.0;
            System.out.printf("Equivalent temperature in Celsius: %.2f", C);
        } else if (scale.equals("C")) {
            System.out.print("Enter the temperature in Celsius: ");
            C = sc.nextDouble();
            F = (C * 9/5) + 32;
            System.out.printf("Equivalent temperature in Fahrenheit: %.2f", F);
        } else {
            System.out.printf("Please put a valid value, just: 'C' or 'F'");
        }

        sc.close();

    }
}
