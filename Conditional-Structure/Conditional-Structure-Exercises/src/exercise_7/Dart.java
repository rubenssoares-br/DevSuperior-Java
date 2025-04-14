package exercise_7;

import java.util.Scanner;

public class Dart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double firstDistance, secondDistance, thirdDistance;

        System.out.println("Enter the three distances:");
        firstDistance = sc.nextDouble();
        secondDistance = sc.nextDouble();
        thirdDistance = sc.nextDouble();

        if (firstDistance > secondDistance && firstDistance > thirdDistance) {
            System.out.printf("Longest distance: %.2f", firstDistance);
        } else if (secondDistance > firstDistance && secondDistance > thirdDistance) {
            System.out.printf("Longest distance: %.2f", secondDistance);
        } else if (thirdDistance > secondDistance && thirdDistance > firstDistance) {
            System.out.printf("Longest distance: %.2f", thirdDistance);
        } else {
            System.out.printf("There is no single maximum distance, try again!");
        }


        sc.close();
    }
}
