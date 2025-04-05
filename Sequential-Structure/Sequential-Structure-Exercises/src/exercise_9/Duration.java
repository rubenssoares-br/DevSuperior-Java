package exercise_9;

import java.util.Scanner;

public class Duration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seconds, minutesResult, hourResult, secondResult;

        System.out.print("Enter the duration in seconds: ");
        seconds = sc.nextInt();

        hourResult = seconds / 3600;
        minutesResult = (seconds % 3600) / 60;
        secondResult = seconds % 60;

        System.out.printf("%d:%d:%d", hourResult, minutesResult, secondResult);

        sc.close();
    }

}
