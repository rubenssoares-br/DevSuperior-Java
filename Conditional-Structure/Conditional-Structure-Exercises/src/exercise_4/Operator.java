package exercise_4;

import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double minutesConsumed, billValue, extraMinutes;

        System.out.print("Enter the amount of minutes consumed: ");
        minutesConsumed = sc.nextDouble();

        if (minutesConsumed > 100) {
            extraMinutes = minutesConsumed - 100;

            billValue = 50 + (extraMinutes * 2);

            System.out.printf("Bill value: R$ %.2f", billValue);
        } else {
            billValue = 50;

            System.out.printf("Bill value: R$ %.2f", billValue);
        }

        sc.close();

    }
}
