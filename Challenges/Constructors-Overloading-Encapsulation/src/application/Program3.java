package application;

import entities.Champion;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String player, name;
        int life, attack, armor, laps;

        Champion champion1 = null;
        Champion champion2 = null;

        for (int i = 0; i < 2; i++) {
            player = i == 0 ? "first" : "second";

            System.out.printf("Enter the details of the %s champion:%n", player);

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Initial life: ");
            life = sc.nextInt();

            System.out.print("Attack: ");
            attack = sc.nextInt();

            System.out.print("Armor: ");
            armor = sc.nextInt();

            sc.nextLine();

            System.out.print("\n");

            if (i == 0) {
                champion1 = new Champion(name, life, attack, armor);
            } else {
                champion2 = new Champion(name, life, attack, armor);
            }
        }

        System.out.print("How many laps do you want? ");
        laps = sc.nextInt();

        for (int i =  1; i <= laps; i++) {
            champion1.takeDamage(champion2);

            champion2.takeDamage(champion1);

            System.out.printf("%nResults of the %d lap:%n", i);

            System.out.println(champion1.status());

            System.out.println(champion2.status());

            if (champion1.getLife() == 0 || champion2.getLife() == 0) {
                break;
            }
        }

        System.out.print("\nEND OF COMBAT");
        

        sc.close();
    }
}
