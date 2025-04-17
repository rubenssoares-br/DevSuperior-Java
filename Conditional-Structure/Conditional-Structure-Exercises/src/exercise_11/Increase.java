package exercise_11;

import java.util.Scanner;

public class Increase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double increasedWage, percentIncrease, currentWage, increase;

        System.out.print("Enter the Wage of the person: ");
        currentWage = sc.nextDouble();

        if (currentWage <= 1000) {
             percentIncrease = 12;
             increasedWage = currentWage * 1.2;
        } else if (currentWage > 1000 && currentWage <= 3000) {
            percentIncrease = 15;
            increasedWage = currentWage * 1.15;
        } else if (currentWage > 3000 && currentWage <= 8000) {
            percentIncrease = 10;
            increasedWage = currentWage * 1.1;
        } else {
            percentIncrease = 5;
            increasedWage = currentWage * 1.05;
        }

        increase = increasedWage - currentWage;

        System.out.printf("New wage = US$ %.2f%n", increasedWage);

        System.out.printf("Increase = US$ %.2f%n", increase);

        System.out.printf("Percentage = US$ %.2f %%", percentIncrease);

        sc.close();
    }
}
