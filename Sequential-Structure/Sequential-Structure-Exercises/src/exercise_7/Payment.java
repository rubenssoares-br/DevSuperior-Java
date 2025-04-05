package exercise_7;

import java.util.Scanner;

public class Payment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double payment, hourValue, quantityHoursWorked;

        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Value per hour worked: ");
        hourValue = sc.nextDouble();

        System.out.print("Quantity hours worked: ");
        quantityHoursWorked = sc.nextDouble();

        payment = hourValue * quantityHoursWorked;

        System.out.printf("The payment for %s should be: %.2f", name, payment);

        sc.close();

    }
}
