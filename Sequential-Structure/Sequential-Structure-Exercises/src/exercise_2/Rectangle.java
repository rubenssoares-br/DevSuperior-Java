package exercise_2;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double rectangleBase;
        double rectangleHeight;

        System.out.print("Rectangle base: ");
        rectangleBase = sc.nextDouble();

        System.out.print("Rectangle height: ");
        rectangleHeight = sc.nextDouble();

        double area = rectangleBase * rectangleHeight;
        System.out.printf("Area = %.4f%n", area);

        double perimeter = (rectangleBase * 2) + (rectangleHeight * 2);
        System.out.printf("Perimeter = %.4f%n", perimeter);

        double diagonal = Math.sqrt((rectangleBase * rectangleBase) + (rectangleHeight * rectangleHeight));
        System.out.printf("Diagonal = %.4f%n", diagonal);

        sc.close();

    }
}
