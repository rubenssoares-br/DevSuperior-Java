package exercise_8;

import java.util.Scanner;

public class Measures {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double measureA, measureB, measureC, areaSquare, areaTriangle, areaTrapezoid;

        System.out.print("Enter the value of measure A: ");
        measureA = sc.nextDouble();

        System.out.print("Enter the value of measure B: ");
        measureB = sc.nextDouble();

        System.out.print("Enter the value of measure C: ");
        measureC = sc.nextDouble();

        areaSquare = measureA * measureA;

        areaTriangle = (measureA * measureB) / 2;

        areaTrapezoid = ((measureA + measureB) * measureC) / 2;

        System.out.printf("Square Area = %.4f%n", areaSquare);

        System.out.printf("Triangle Area = %.4f%n", areaTriangle);

        System.out.printf("Trapezoid Area = %.4f%n", areaTrapezoid);

        sc.close();

    }
}
