package exercise_6;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double circleRadius, area;

        double π = 3.14159;

        System.out.print("Type the value of circle Radius: ");
        circleRadius = sc.nextDouble();

        area = π * Math.pow(circleRadius, 2);

        System.out.printf("Area = %.3f", area);

        sc.close();

    }
}
