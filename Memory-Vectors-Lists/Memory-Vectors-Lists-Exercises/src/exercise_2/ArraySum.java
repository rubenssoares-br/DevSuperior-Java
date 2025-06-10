package exercise_2;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        double sum = 0, average;
        System.out.print("How many numbers you will enter? ");
        n = scanner.nextInt();

        double[] total = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            total[i] = scanner.nextDouble();
        }

        System.out.print("VALUES = ");

        for (int i = 0; i < total.length; i++) {
            System.out.print(total[i] + " ");
            sum += total[i];
        }

        System.out.printf("%n%nSUM = %.2f", sum);

        average = sum / n;

        System.out.printf("%nAVERAGE = %.2f%n", average);

        scanner.close();
    }
}
