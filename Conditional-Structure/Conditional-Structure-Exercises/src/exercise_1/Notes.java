package exercise_1;

import java.util.Scanner;

public class Notes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double firstNote, secondNote, finalNote;
        String result;

        System.out.print("Type the first note: ");
        firstNote = sc.nextDouble();

        System.out.print("Type the second note: ");
        secondNote = sc.nextDouble();

        finalNote = firstNote + secondNote;

        if (finalNote < 60) {
            result = "FAILED";
        } else {
            result = "APPROVED";
        }

        if (result == "APPROVED") {
            System.out.printf("FINAL NOTE = %.1f%n", finalNote);
        } else {
            System.out.printf("FINAL NOTE = %.1f%n%s", finalNote, result);
        }

        sc.close();
    }
}
