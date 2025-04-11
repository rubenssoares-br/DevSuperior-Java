package exercise_5;

import java.util.Scanner;

public class VerifiedChange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double change, unitProductPrice, amountBought, moneyReceived, totalBill;

        System.out.print("Unit product price: ");
        unitProductPrice = sc.nextDouble();

        System.out.print("Amount bought: ");
        amountBought = sc.nextDouble();

        System.out.print("Money received: ");
        moneyReceived = sc.nextDouble();

        totalBill = unitProductPrice * amountBought;

        if (moneyReceived >= totalBill) {

            change = moneyReceived - totalBill;

            System.out.printf("CHANGE = %.2f", change);

        } else {

            change = totalBill - moneyReceived;

            System.out.printf("Not enough money, %.2f dollars left", change);

        }

        sc.close();
    }

}
