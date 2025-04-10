package exercise_3;

import java.util.Scanner;

public class UnderThree {

    public static void main(String[] args) {

        int firstValue, secondValue, thirdValue;

        Scanner sc = new Scanner(System.in);

        System.out.print("First value: ");
        firstValue = sc.nextInt();

        System.out.print("Second value: ");
        secondValue = sc.nextInt();

        System.out.print("Third value: ");
        thirdValue = sc.nextInt();

        if (firstValue < secondValue && firstValue < thirdValue) {
            System.out.printf("Minor = %d", firstValue);
        } else if (secondValue < firstValue && secondValue < thirdValue) {
            System.out.printf("Minor = %d", secondValue);
        } else if (thirdValue < secondValue && thirdValue < firstValue) {
            System.out.printf("Minor = %d", thirdValue);
        } else if (firstValue == secondValue && firstValue < thirdValue) {
            System.out.printf("Minor = %d", firstValue);
        } else if (secondValue == thirdValue && secondValue < firstValue) {
            System.out.printf("Minor = %d", secondValue);
        } else {
            System.out.printf("Minor = %d", thirdValue);
        }

        sc.close();

    }

}
