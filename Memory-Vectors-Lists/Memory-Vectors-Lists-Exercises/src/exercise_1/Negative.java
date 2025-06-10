package exercise_1;

import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("How many numbers you will enter? ");
        n = sc.nextInt();

        if (n > 10) {
            System.out.print("Please enter a positive integer value that does not exceed 10!");
        } else {

            int[] total = new int[n];

            for (int i = 0; i < total.length; i++) {
                System.out.print("Enter a number: ");
                total[i] = sc.nextInt();
            }

            System.out.println("NEGATIVE NUMBERS:");

            for (int i = 0; i < total.length; i++) {
                if (total[i] < 0) {
                    System.out.println(total[i]);
                }
            }


        }

        sc.close();
    }
}
