package exercise_1;

import java.util.Scanner;

public class Increasing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X, Y;

        System.out.println("Enter two numbers:");
        X = sc.nextInt();
        Y = sc.nextInt();

        while (X != Y) {
            if (X > Y) {
                System.out.println("Decreasing");
            } else if (X < Y) {
                System.out.println("Increasing");
            }
            System.out.println("Enter two others numbers: ");
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();
    }
}
