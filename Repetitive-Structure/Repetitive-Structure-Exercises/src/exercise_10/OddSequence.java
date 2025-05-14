package exercise_10;

import java.util.Scanner;

public class OddSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Enter a x value: ");
        x = sc.nextInt();


        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d\n", i);
            }
        }

        sc.close();
    }
}
