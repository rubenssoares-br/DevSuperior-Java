package application;

import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ntp;
        System.out.print("How many TaxPayers you will contribute? ");
        ntp = sc.nextInt();

        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 1; i <= ntp; i++) {
            System.out.printf("%nEnter the data of the %d taxPayer%n", i);

            System.out.print("Annual income with salary: ");
            Double salaryYearIncome = sc.nextDouble();

            System.out.print("Annual income with service provision: ");
            Double servicesIncome = sc.nextDouble();

            System.out.print("Annual income with capital gain: ");
            Double capitalIncome = sc.nextDouble();

            System.out.print("Health Expenses: ");
            Double healthSpending = sc.nextDouble();

            System.out.print("Education Expenses: ");
            Double educationSpending = sc.nextDouble();

            TaxPayer taxPayer = new TaxPayer(salaryYearIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);

            taxPayers.add(taxPayer);
        }

        for (int i = 1; i <= taxPayers.size(); i++) {
            System.out.printf("%nSummary of the %d taxPayer: %n", i);
            System.out.printf("Total gross tax: %.2f%n", taxPayers.get(i - 1).grossTax());
            System.out.printf("Rebate: %.2f%n", taxPayers.get(i - 1).taxRebate());
            System.out.printf("Tax due: %.2f%n", taxPayers.get(i - 1).netTax());
        }


        sc.close();

    }
}
