package exercise_10;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstNumber, secondNumber;

        System.out.println("Enter two int numbers: ");
        firstNumber = sc.nextInt();
        secondNumber = sc.nextInt();

        if ((firstNumber % secondNumber) == 0 || (secondNumber % firstNumber) == 0) {
            System.out.println("Are multiples!");
        } else {
            System.out.println("Are not multiples!");
        }

        sc.close();

    }
}
