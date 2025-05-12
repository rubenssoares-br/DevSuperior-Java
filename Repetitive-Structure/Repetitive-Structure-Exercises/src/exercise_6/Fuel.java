package exercise_6;

import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int code, alcohol = 0, gasoline = 0, diesel = 0;

        System.out.print("Enter a code (1, 2, 3) or 4 to stop: ");
        code = sc.nextInt();

        while (code != 4) {
            if (code == 1) {
                alcohol ++;
            } else if (code == 2) {
                gasoline ++;
            } else if (code == 3) {
                diesel ++;
            }
            System.out.print("Enter a code (1, 2, 3) or 4 to stop: ");
            code = sc.nextInt();
        }

        System.out.println("THANK YOU");
        System.out.printf("Alcohol: %d\n", alcohol);
        System.out.printf("Gasoline: %d\n", gasoline);
        System.out.printf("Diesel: %d", diesel);

        sc.close();
    }
}
