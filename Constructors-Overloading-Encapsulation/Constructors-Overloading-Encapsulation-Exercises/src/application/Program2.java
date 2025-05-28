package application;

import entities.Account;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer number;
        String holder;
        Double balance = 0.00;
        System.out.print("Enter account number: ");
        number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char s = sc.next().charAt(0);

        if (s == 'y') {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
        }

        Account account = new Account(number, holder, balance);

        System.out.println("\nAccount data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }

}
