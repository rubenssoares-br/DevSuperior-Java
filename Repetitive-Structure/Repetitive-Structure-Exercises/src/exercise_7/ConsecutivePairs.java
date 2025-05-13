package exercise_7;

import java.util.Scanner;

public class ConsecutivePairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, sum;

        System.out.print("Enter an int number: ");
        x = sc.nextInt();

        while (x != 0) {
            if (x % 2 == 0) {
                sum = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);
            } else {
                sum = (x + 1) + (x + 3) + (x + 5) + (x + 7) + (x + 9);
            }

            System.out.printf("SUM = %d\n", sum);
            System.out.print("Enter an int number: ");
            x = sc.nextInt();
        }

        sc.close();
    }
}
