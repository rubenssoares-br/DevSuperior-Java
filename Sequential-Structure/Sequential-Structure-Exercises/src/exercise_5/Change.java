package exercise_5;

import java.util.Scanner;

public class Change {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double unitProductPrice, quantityPurchased, moneyReceived, change;

        System.out.print("Unit price of the product: ");
        unitProductPrice = sc.nextDouble();

        System.out.print("Quantity purchased: ");
        quantityPurchased = sc.nextDouble();

        System.out.print("Money received: ");
        moneyReceived = sc.nextDouble();

        change = moneyReceived - (unitProductPrice * quantityPurchased);

        System.out.printf("CHANGE = %.2f", change);

        sc.close();
    }
}
