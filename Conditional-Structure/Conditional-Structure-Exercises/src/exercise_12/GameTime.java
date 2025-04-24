package exercise_12;

import java.util.Scanner;

public class GameTime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int initialHour, finalHour, hoursGaming;

        System.out.print("Initial hour: ");
        initialHour = sc.nextInt();

        System.out.print("Final hour: ");
        finalHour = sc.nextInt();

        if (initialHour > finalHour) {
            hoursGaming = (24 - initialHour) + finalHour;
            System.out.printf("THE GAME LASTED %d HOUR(S)", hoursGaming);
        } else if (initialHour < finalHour) {
            hoursGaming = finalHour - initialHour;
            System.out.printf("THE GAME LASTED %d HOUR(S)", hoursGaming);
        } else {
            System.out.println("THE GAME LASTED 24 HOURS");
        }

        sc.close();
    }
}
