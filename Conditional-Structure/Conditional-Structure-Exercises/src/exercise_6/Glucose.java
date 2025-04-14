package exercise_6;

import java.util.Scanner;

public class Glucose {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double normal, high, glucoseMeasure;

        normal = 100;

        high = 140;

        System.out.print("Enter your glucose measure: ");
        glucoseMeasure = sc.nextDouble();

        if (glucoseMeasure <= normal) {
            System.out.printf("Classification: normal");
        } else if (glucoseMeasure > normal && glucoseMeasure <= high) {
            System.out.printf("Classification: high");
        } else {
            System.out.printf("Classification: diabetes");
        }

        sc.close();

    }

}
