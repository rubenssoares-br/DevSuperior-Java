package exercise_2;

import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, X1, X2, delta;

        System.out.print("Coefficient a: ");
        a = sc.nextDouble();

        System.out.print("Coefficient b: ");
        b = sc.nextDouble();

        System.out.print("Coefficient c: ");
        c = sc.nextDouble();

        delta = (Math.pow(b, 2)) - (4 * a * c);

        if (delta > 0) {

        X1 = ((-b) + Math.sqrt(delta)) / (2 * a);

        X2 = ((-b) - Math.sqrt(delta)) / (2 * a);

        System.out.printf("X1 = %.4f%n", X1);

        System.out.printf("X2 = %.4f", X2);

    } else {

        System.out.print("This equation has no real squares");

        }

        sc.close();
    }

}
