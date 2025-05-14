package exercise_11;

import java.util.Scanner;

public class InsideOutside {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, x, insideInt = 0, outsideInt = 0;

        System.out.print("How many numbers you will type? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                insideInt++;
            } else {
                outsideInt++;
            }
        }

        System.out.printf("%d Inside\n", insideInt);
        System.out.printf("%d Outside", outsideInt);



        sc.close();
    }
}
