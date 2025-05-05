package exercise_2;

import java.util.Scanner;

public class AverageAges {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ages, averageAges, newAge, totalAgesValue, totalAgesAmount;

        ages = 0;
        totalAgesAmount = 0;
        totalAgesValue = 0;
        System.out.println("Enter the ages: ");
        ages = sc.nextInt();

        if (ages > 0) {

            while (ages > 0) {
                totalAgesValue += ages;
                totalAgesAmount ++;
                ages = sc.nextInt();
            }

            averageAges = totalAgesValue / totalAgesAmount;
            System.out.printf("Average = %.2f", averageAges);

        } else {
            System.out.println("Impossible to Calculate!");
        }

        sc.close();
    }
}
