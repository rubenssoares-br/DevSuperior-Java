package exercise_9;

import java.util.Scanner;

public class OddSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, oddSum = 0, smallest, biggest;

        System.out.println("Enter two numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x < y) {
            smallest = x;
            biggest = y;
        } else {
            smallest = y;
            biggest = x;
        }

        for (int i = smallest + 1; i < biggest; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }

        System.out.printf("Odd sum = %d", oddSum);

        sc.close();
    }
}
