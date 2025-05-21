package application;

import entities.Bill;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        final int beerValue = 5, barbecueValue = 7, softDrinkValue = 3;

        Scanner sc = new Scanner(System.in);

        Bill clientBill = new Bill();

        System.out.print("Sex: ");
        clientBill.setGender(sc.next().charAt(0));

        System.out.print("Amount of beers: ");
        clientBill.setBeer(sc.nextInt() * beerValue);

        System.out.print("Amount of softDrinks: ");
        clientBill.setSoftDrink(sc.nextInt() * softDrinkValue);

        System.out.print("Amount of barbecues: ");
        clientBill.setBarbecue(sc.nextInt() * barbecueValue);

        System.out.println(clientBill.toString());

        sc.close();
    }
}
