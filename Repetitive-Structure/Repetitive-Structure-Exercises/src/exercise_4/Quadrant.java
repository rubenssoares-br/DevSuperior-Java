package exercise_4;

import java.util.Scanner;

public class Quadrant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X, Y;

        System.out.println("Enter the coordinates X and Y values:");
        X = sc.nextInt();
        Y = sc.nextInt();

        while (X != 0 && Y != 0) {
            if (X > 0 && Y > 0) {
                System.out.println("Q1");
            } else if (X > 0 && Y < 0) {
                System.out.println("Q4");
            } else if (X < 0 && Y > 0) {
                System.out.println("Q2");
            } else if (X < 0 && Y < 0) {
                System.out.println("Q3");
            }
            System.out.println("Enter the coordinates X and Y values:");
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        System.out.println("Invalid value to be specified in quadrant only");

        sc.close();
    }
}
