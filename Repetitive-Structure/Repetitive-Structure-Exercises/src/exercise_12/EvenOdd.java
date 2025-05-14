package exercise_12;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, number;

        System.out.print("How many numbers you will type? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            if (number == 0) {
                System.out.println("Null");
            } else if (number % 2 == 0) {
                if (number < 0) {
                    System.out.println("Even negative!");
                } else {
                    System.out.println("Even positive!");
                }
                    } else {
                        if (number < 0) {
                            System.out.println("Odd negative!");
                        } else {
                            System.out.println("Odd positive!");
                        }
            }
        }


        sc.close();

    }
}
