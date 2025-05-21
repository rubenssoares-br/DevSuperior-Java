package exercise_1.application;

import exercise_1.entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter with the width and height of the Rectangle: ");
        rectangle.setWidth(sc.nextDouble());
        rectangle.setHeight(sc.nextDouble());

        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

        sc.close();
    }
}
