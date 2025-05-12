package exercise_5;

import java.util.Scanner;

public class NoteValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstNote, secondNote, average;

        System.out.print("Enter the first note: ");
        firstNote = sc.nextDouble();

        while (firstNote < 0 || firstNote > 10) {
            System.out.print("Invalid value! Try again: ");
            firstNote = sc.nextDouble();
        }

        System.out.print("Enter the second note: ");
        secondNote = sc.nextDouble();

        while (secondNote < 0 || secondNote > 10) {
            System.out.print("Invalid value! Try again: ");
            secondNote = sc.nextDouble();
        }

        average = (firstNote + secondNote) / 2;

        System.out.printf("Average = %.2f", average);

        sc.close();
    }
}
