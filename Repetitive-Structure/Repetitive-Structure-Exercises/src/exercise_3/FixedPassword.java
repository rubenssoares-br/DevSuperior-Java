package exercise_3;

import java.util.Scanner;

public class FixedPassword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPassword, inputPassword;

        correctPassword = 2002;

        System.out.print("Enter the password: ");
        inputPassword = sc.nextInt();

        while (inputPassword != correctPassword) {
            System.out.print("Wrong password! Try again: ");
            inputPassword = sc.nextInt();
        }

        System.out.println("Access allowed!");

        sc.close();
    }

}
