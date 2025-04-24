package exercise_13;

import java.util.Scanner;

public class Coordinates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double X, Y;

        System.out.print("X Value: ");
        X = sc.nextDouble();

        System.out.print("Y Value: ");
        Y = sc.nextDouble();

        if (X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        } else if (X == 0 && Y == 0) {
            System.out.println("Origin");
        } else if (X == 0 && Y > 0 || Y < 0) {
            System.out.println("Axle Y");
        } else if (Y == 0 && X > 0 || X < 0) {
            System.out.println("Axle X");
        } else {
            System.out.println("Invalid X or Y values!");
        }

        sc.close();

    }
}
