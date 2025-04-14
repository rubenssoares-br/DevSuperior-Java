package exercise_9;

import java.util.Scanner;

public class Cafeteria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int productCode, productQuantity;
        double productPrice = 0, total;


        System.out.print("Enter the product code: ");
        productCode = sc.nextInt();

        switch (productCode) {
            case 1:
                productPrice = 5.00;
                break;
            case 2:
                productPrice = 3.50;
                break;
            case 3:
                productPrice = 4.80;
                break;
            case 4:
                productPrice = 8.90;
                break;
            case 5:
                productPrice = 7.32;
                break;
        }

        System.out.print("Quantity bought: ");
        productQuantity = sc.nextInt();

        total = productQuantity * productPrice;

        System.out.printf("Total value to pay: US$ %.2f", total);

        sc.close();
    }
}
