package exercise_4;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X, Y, sumResult;

        System.out.print("Enter the value of X: ");
        X = sc.nextInt();

        System.out.print("Enter the value of Y: ");
        Y = sc.nextInt();

        sumResult = X + Y;

        System.out.printf("SUM = %d", sumResult);

        sc.close();

    }
}
