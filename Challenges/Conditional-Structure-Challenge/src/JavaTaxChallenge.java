import java.util.Scanner;

public class JavaTaxChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salaryPerYear, salaryTaxPercentage, salaryTax, salaryPerMonth;
        double serviceProvisionPerYear, serviceProvisionTaxPercentage, serviceProvisionTax;
        double capitalGainPerYear, capitalGainTaxPercentage, capitalGainTax;
        double medicalExpense, educationalExpense, taxRebate, taxDue;
        double totalTax, maximumDeductibleTotalTax, deductibleExpenses;

        System.out.print("Annual income with salary: ");
        salaryPerYear = sc.nextDouble();
        salaryPerMonth = salaryPerYear / 12;

        if (salaryPerMonth < 3000) {
            salaryTaxPercentage = 0;
        } else if (salaryPerMonth > 3000 && salaryPerMonth < 5000) {
            salaryTaxPercentage = 0.1;
        } else {
            salaryTaxPercentage = 0.2;
        }

        salaryTax = salaryTaxPercentage * salaryPerYear;

        System.out.print("Annual income with service provision: ");
        serviceProvisionPerYear = sc.nextDouble();

        if (serviceProvisionPerYear > 0) {
            serviceProvisionTaxPercentage = 0.15;
        } else {
            serviceProvisionTaxPercentage = 0;
        }

        serviceProvisionTax = serviceProvisionPerYear * serviceProvisionTaxPercentage;

        System.out.print("Annual income with capital gains: ");
        capitalGainPerYear = sc.nextDouble();

        if (capitalGainPerYear > 0) {
            capitalGainTaxPercentage = 0.2;
        } else  {
            capitalGainTaxPercentage = 0;
        }

        capitalGainTax = capitalGainPerYear * capitalGainTaxPercentage;

        System.out.print("Medical expenses: ");
        medicalExpense = sc.nextDouble();

        System.out.print("Educational expenses: ");
        educationalExpense = sc.nextDouble();

        totalTax = salaryTax + serviceProvisionTax + capitalGainTax;

        maximumDeductibleTotalTax = totalTax * 0.3;

        deductibleExpenses = medicalExpense + educationalExpense;

        if (maximumDeductibleTotalTax >= deductibleExpenses) {
            taxRebate = deductibleExpenses;
        } else {
            taxRebate = maximumDeductibleTotalTax;
        }

        taxDue = totalTax - taxRebate;

        System.out.println("\nIncome Tax Report: \n");
        System.out.println("Income consolidation: ");
        System.out.printf("Salary tax: %.2f\n", salaryTax);
        System.out.printf("Service tax: %.2f\n", serviceProvisionTax);
        System.out.printf("Capital gain tax: %.2f\n\n", capitalGainTax);

        System.out.print("Deductions: \n");
        System.out.printf("Maximum deductible: %.2f\n", maximumDeductibleTotalTax);
        System.out.printf("Deductible expenses: %.2f\n", deductibleExpenses);

        System.out.println("\nSummary: ");
        System.out.printf("Total gross tax: %.2f\n", totalTax);
        System.out.printf("Rebate: %.2f\n", taxRebate);
        System.out.printf("Tax due: %.2f", taxDue);

        sc.close();
    }
}
